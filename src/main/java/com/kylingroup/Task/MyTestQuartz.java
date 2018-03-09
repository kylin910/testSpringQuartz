package com.kylingroup.Task;

public class MyTestQuartz {
    public void job_quartz_seconds(){
        System.out.println("job_quartz_seconds is run" +System.currentTimeMillis());
    }
    public void job_quartz_minute(){
        System.out.println("job_quartz_minute is run" +System.currentTimeMillis());
    }
}
