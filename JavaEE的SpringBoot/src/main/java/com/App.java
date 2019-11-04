package com;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.jms.Queue;

@SpringBootApplication
public class App{
    public static void main(String[] args)
    {
        SpringApplication.run(App.class,args);
    }
    @Bean
    Queue queue(){
        return new ActiveMQQueue("amp");
    }
}
