package com.config;

import config.RibbonConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "whc-provider-user",configuration = RibbonConfiguration.class)
public class TestConfiguration {
}
