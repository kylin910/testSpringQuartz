package com.kylingroup.Task;

import org.springframework.scheduling.annotation.Scheduled;

import org.springframework.stereotype.Component;
/**
 * springmvc自带的定时操作
 * @author mm
 */

@Component
public class MyTask {

    /*@Scheduled(cron="0/5 * * * * ?")*/
    public void job_seconds(){
        System.out.println("job_seconds is run" +System.currentTimeMillis());
    }
    public void job_minute(){
        System.out.println("job_minute is run-------------" +System.currentTimeMillis());
    }
    public void job_day(){
        System.out.println("job_day is run-------------" +System.currentTimeMillis());
    }
    public void job_month(){
        System.out.println("job_month is run-------------" +System.currentTimeMillis());
    }
}
