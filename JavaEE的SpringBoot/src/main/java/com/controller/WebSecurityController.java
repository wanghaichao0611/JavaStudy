package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSecurityController {
    @GetMapping("/hello1")
    public String hello() {
        return "Hello";
    }
    @GetMapping("/admin/hello1")
    public String admin(){
        return "hello admin!";
    }
    @GetMapping("user/hello1")
    public String user(){
        return "hello user!";
    }
    @GetMapping("/db/hello1")
    public String dba(){
        return "hello dba!";
    }
}
