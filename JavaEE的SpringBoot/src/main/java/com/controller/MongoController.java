package com.controller;

import com.Mapper.Mapper1.MongodbDao;
import com.entity.MongoDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MongoController {
    @Autowired
    MongodbDao mongodbDao;
    @GetMapping("mongo")
    public void mongo(){
        List<MongoDb> mongoDbs=new ArrayList<>();
        MongoDb b1=new MongoDb();
        b1.setId(1);
        b1.setName("朝花夕拾");
        b1.setAuthor("鲁迅");
        mongoDbs.add(b1);
        MongoDb b2=new MongoDb();
        b2.setId(2);
        b2.setName("呐喊");
        b2.setAuthor("鲁迅");
        mongoDbs.add(b2);
        mongodbDao.insert(mongoDbs);
        List<MongoDb> mongoDbs1=mongodbDao.findByAuthorContains("鲁迅");
        System.out.println(mongoDbs1);
        MongoDb mongoDb=mongodbDao.findByNameEquals("朝花夕拾");
        System.out.println(mongoDb);
    }
}
