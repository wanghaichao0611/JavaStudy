package com.controller;

import com.entity.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpiderController {

    //测试
    @GetMapping("/first")
    public Test first(){
        Test test =new Test();
        test.setName("whc");
        test.setCode("123");
        return test;
    }

}
