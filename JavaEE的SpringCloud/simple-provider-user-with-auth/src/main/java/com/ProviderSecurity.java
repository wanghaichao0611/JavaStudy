package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderSecurity
{
    public static void main(String[] args)
    {
        SpringApplication.run(ProviderSecurity.class,args);
    }
}
