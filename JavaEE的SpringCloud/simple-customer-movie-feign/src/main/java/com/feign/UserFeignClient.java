package com.feign;

import com.Entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "whc-provider-user")//用于创建Ribbon负载均衡器
public interface UserFeignClient {
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable("id")Long id);
}
