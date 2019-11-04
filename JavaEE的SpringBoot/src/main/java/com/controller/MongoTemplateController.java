package com.controller;

import com.entity.MongoDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class MongoTemplateController {
    @Autowired
    MongoTemplate mongoTemplate;
    @GetMapping("/mongoTemplate")
    public void mongoTemplate(){
        List<MongoDb> dbs=new ArrayList<>();
        MongoDb b1=new MongoDb();
        b1.setId(3);
        b1.setName("围城");
        b1.setAuthor("钱钟书");
        dbs.add(b1);
        MongoDb b2=new MongoDb();
        b2.setId(4);
        b2.setName("宋诗选注");
        b2.setAuthor("钱钟书");
        dbs.add(b2);
        mongoTemplate.insertAll(dbs);
        List<MongoDb> list=mongoTemplate.findAll(MongoDb.class);
        System.out.println(list);
        MongoDb db=mongoTemplate.findById(3,MongoDb.class);
        System.out.println(db);
    }
}
