package com.controller;

import com.entity.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController{
    @Autowired(required = false)
    public BookService bookService;

    @GetMapping("/bookOps")
    public void bookOps(){
        Book b1=new Book();
        b1.setName("西厢记");
        b1.setAuthor("王实甫");
        int i=bookService.addBook(b1);
        System.out.println("addBook>>>"+i);
        Book b2=new Book();
        b2.setId(1);
        b2.setName("朝花夕拾");
        b2.setAuthor("鲁迅");
        int updateBook=bookService.updateBook(b2);
        System.out.println("updateBook>>>"+updateBook);
        Book b3=new Book();
           int delete=bookService.deleteByPrimaryKey(2);
        System.out.println("delete>>>"+delete);
        List<Book> b4=bookService.selectByPrimaryKey(1);
        System.out.println("select>>"+b4);
    }

}