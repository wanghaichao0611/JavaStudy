package com.controller;

import com.Book.JpaMuch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JeTemplateMuchController {
    @Autowired
    @Qualifier("jdbcTemplateOne")
    JdbcTemplate jdbcTemplateOne;
    @Autowired
    @Qualifier("jdbcTemplateTwo")
    JdbcTemplate jdbcTemplateTwo;
    @GetMapping("/test1")
    public void test1(){
        List<JpaMuch> books1=jdbcTemplateOne.query("select * from book",new BeanPropertyRowMapper<>(JpaMuch.class));
        List<JpaMuch> books2=jdbcTemplateTwo.query("select * from book",new BeanPropertyRowMapper<>(JpaMuch.class));
        System.out.println("books1:"+books1);
        System.out.println("books2:"+books2);
    }
}
