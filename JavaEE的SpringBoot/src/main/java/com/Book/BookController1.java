package com.Book;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController1
{
    @GetMapping("/books")
    public ModelAndView books()
    {
        List<Book> books=new ArrayList<>();
        Book b1=new Book();
        b1.setId(1);
        b1.setAuthor("罗贯中");
        b1.setName("三国演义");
        Book b2=new Book();
        b2.setId(2);
        b2.setAuthor("曹雪芹");
        b2.setName("红楼梦");
        books.add(b1);
        books.add(b2);
        ModelAndView mv=new ModelAndView();
        mv.addObject("books",books);
        mv.setViewName("books");
        return mv;
    }
}