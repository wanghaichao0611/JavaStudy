package com.controller;

import com.dao1.UserDao;
import com.dao2.UserDao2;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaUserController {
    @Autowired
    UserDao userDao;
    @Autowired
    UserDao2 userDao2;
    @GetMapping("/test3")
    public void test3(){
        User ul=new User();
        ul.setAge(55);
        ul.setName("鲁迅");
        ul.setGender("男");
        userDao.save(ul);
        User u2=new User();
        u2.setAge(80);
        u2.setName("泰戈尔");
        u2.setGender("男");
        userDao2.save(u2);
    }
}
