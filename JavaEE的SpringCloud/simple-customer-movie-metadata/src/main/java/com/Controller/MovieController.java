package com.Controller;

import com.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
public class MovieController{
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        return this.restTemplate.getForObject("http://localhost:8000/"+id,User.class);
    }

    /**
     * 查询user服务返回的信息并返回元数据和自定义数据
     * **/
    @GetMapping("/user-instance")
    public List<ServiceInstance> showInfo(){
        return this.discoveryClient.getInstances("whc-provider-user");
    }
}
