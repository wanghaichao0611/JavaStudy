package com.controller;

import com.Mapper.Mapper1.JpaRestFulRepository;
import com.entity.JpaRestFul;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaPostmanController {
    @Autowired
    JpaRestFulRepository jpaRestFulRepository;
    @PostMapping("/jparestful")
    public void jparestful(String name,String author){
        JpaRestFul jpaRestFul=new JpaRestFul();
        jpaRestFul.setAuthor(author);
        jpaRestFul.setName(name);
        jpaRestFulRepository.save(jpaRestFul);
    }
}
