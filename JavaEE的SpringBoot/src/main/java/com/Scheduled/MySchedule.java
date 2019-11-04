package com.Scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MySchedule {
    @Scheduled(fixedDelay = 1000)//当前时间结束后执行1秒后开启另一个任务
    public void fixedDelay(){
        System.out.println("fixedDelay:"+new Date());
    }
    @Scheduled(fixedRate = 2000)//表示在当前任务开始执行2秒后开启另一个定时任务
    public void fixedRate(){
        System.out.println("fixedRate:"+new Date());
    }
    @Scheduled(initialDelay = 1000,fixedRate = 2000)//initialDelay表示首次执行的延迟时间
    public void initiakDelay(){
        System.out.println("initalDelay:"+new Date());
    }
    @Scheduled(cron = "0 * * * * ?")//表示定时任务每分钟执行一次
    public void cron(){
        System.out.println("cron:"+new Date());
    }
}
