package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@SpringBootApplication
@EnableTurbineStream
public class TurbineRabbit {
    public static void main(String[] args) {
        SpringApplication.run(TurbineRabbit.class, args);
    }
}
