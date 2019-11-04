package com.Controller;

import com.Entity.User;
import com.feign.UserFeignClient;
import feign.Client;
import feign.Contract;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Import(FeignClientsConfiguration.class)
@RestController
public class MovieController{

    private UserFeignClient userUserFeignClient;

    private UserFeignClient adminUserFeignClient;

    public MovieController(Decoder decoder, Encoder encoder, Client client, Contract contract) {
        // 这边的decoder、encoder、client、contract，可以debug看看是什么实例。
        this.userUserFeignClient = Feign.builder().client(client).encoder(encoder).decoder(decoder).contract(contract)
                .requestInterceptor(new BasicAuthRequestInterceptor("user", "password1")).target(UserFeignClient.class, "http://whc-provider-user/");
        this.adminUserFeignClient = Feign.builder().client(client).encoder(encoder).decoder(decoder).contract(contract)
                .requestInterceptor(new BasicAuthRequestInterceptor("admin", "password2"))
                .target(UserFeignClient.class, "http://whc-provider-user/");
    }


    @GetMapping("/user-user/{id}")
    public User findById(@PathVariable Long id){
        return this.userUserFeignClient.findById(id);
    }
    @GetMapping("/user-admin/{id}")
    public User findByIdAdmin(@PathVariable Long id){
        return this.adminUserFeignClient.findById(id);
    }
}
