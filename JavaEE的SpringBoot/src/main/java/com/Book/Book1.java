package com.Book;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Book1 {
    @GetMapping("/book1")
    public userBook book1()
    {
        userBook userBook=new userBook();
        userBook.setAuthor("罗贯中");
        userBook.setName("三国演义");
        userBook.setPrice(30f);
        userBook.setDate(new Date());
        return userBook;
    }

}
