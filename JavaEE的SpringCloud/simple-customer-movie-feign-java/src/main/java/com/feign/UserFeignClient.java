package com.feign;

import com.Config.FeignConfiguration;
import com.Entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 使用@FeignClient的configuration属性，指定feign的配置类
 */
@FeignClient(name = "whc-provider-user",configuration = FeignConfiguration.class)//用于创建Ribbon负载均衡器
public interface UserFeignClient {
    /**
     * 使用feign自带的注解@RequestLine
     */

    @RequestLine("GET /{id}")
    public User findById(@Param("id") Long id);
}
