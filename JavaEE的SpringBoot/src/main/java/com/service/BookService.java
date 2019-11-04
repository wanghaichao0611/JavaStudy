package com.service;

import com.entity.Book;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
    public int addBook(Book book);
    public int updateBook(Book book);
    public Integer deleteByPrimaryKey(Integer id);
    public List<Book> selectByPrimaryKey(Integer id);
}
