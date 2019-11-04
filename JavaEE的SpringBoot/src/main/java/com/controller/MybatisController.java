package com.controller;

import com.Mapper.Mapper1.Mapper1Mapper;
import com.Mapper.Mapper2.Mapper2Mapper;
import com.entity.Mapper1;
import com.entity.Mapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MybatisController {
    @Autowired
    Mapper1Mapper mapper1Mapper;
    @Autowired
    Mapper2Mapper mapper2Mapper;
    @GetMapping("test2")
    public void test2(){
        List<Mapper1> book1=mapper1Mapper.getAll();
        List<Mapper2> book2=mapper2Mapper.getAll();
        System.out.println(book1);
        System.out.println(book2);
    }
}
