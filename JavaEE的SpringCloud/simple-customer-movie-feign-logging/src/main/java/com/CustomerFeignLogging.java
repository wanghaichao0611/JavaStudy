package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CustomerFeignLogging {
    public static void main(String[] args) {
        SpringApplication.run(CustomerFeignLogging.class, args);
    }
}