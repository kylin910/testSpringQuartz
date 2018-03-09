<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>Echo Socket</title>
    
    <script>
        "use strict";

        var ws = null;
        var target="ws://localhost:8080/websocket";
        
        function subOpen(){
        	if('WebSocket' in window){
        		ws=new WebSocket(target);
        	}else if('MozWebSocket' in window){
        		ws=new MozWebSocket(target);
        	}else{
        		alert("WebSocket is not supported by this browser");
        		return;
        	}
        	ws.onmessage=function(event){
        		var serverinfo=document.getElementById("serverinfo");
        		serverinfo.innerHTML=event.data;
        	}
        }
        function subSend(){
        	var msg=document.getElementById("msg").value;
        	ws.send(msg);
        	msg.value="";
        }
	</script>
	
</head>
<body>
	<button onclick="subOpen();">open</button>
	<input id="msg"/>
	<button onclick="subSend();">send</button>
	<p id="serverinfo"></p>
</body>
</html>