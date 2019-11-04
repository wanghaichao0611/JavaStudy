package com.controller;

import com.Book.Jpa;
import com.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JpaController {
    @Autowired
    JpaService jpaService;
    @GetMapping("/findAll")
    public void findAll(){
        PageRequest pageRequest=PageRequest.of(2,3);
        Page<Jpa> page=jpaService.getBookByPage(pageRequest);
        System.out.println("总页数:"+page.getTotalPages());
        System.out.println("总记录数:"+page.getTotalElements());
        System.out.println("查询结果:"+page.getContent());
        System.out.println("当前页数:"+(page.getNumber()+1));
        System.out.println("当前页数记录数:"+page.getNumberOfElements());
        System.out.println("每页记录数:"+page.getSize());
    }
    @GetMapping("/search")
    public void search(){
        List<Jpa> bs1=jpaService.getJpasByIdAndAuthor("鲁迅",7);
        List<Jpa> bs2=jpaService.getJpasByAuthorStartingWith("吴");
        List<Jpa> bs3=jpaService.getJpasByIdAndName("西",8);
        List<Jpa> bs4=jpaService.getJpasByPriceGreaterThan(30F);
        Jpa b=jpaService.getMaxIdJpa();
        System.out.println("bs1:"+bs1);
        System.out.println("bs2:"+bs2);
        System.out.println("bs3:"+bs3);
        System.out.println("bs4:"+bs4);
        System.out.println("b:"+b);
    }
    @GetMapping("/save")
    public void save(){
        Jpa jpa=new Jpa();
        jpa.setAuthor("鲁迅");
        jpa.setName("呐喊");
        jpa.setPrice(23F);
        jpaService.addJpa(jpa);
    }
}
