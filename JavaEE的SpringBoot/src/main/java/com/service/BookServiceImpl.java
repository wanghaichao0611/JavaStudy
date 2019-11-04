package com.service;



import com.Mapper.Mapper1.BookMapper;
import com.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired(required = false)
    public BookMapper bookMapper;
    public int addBook(Book book){
        return bookMapper.insert(book);
    }
    public int updateBook(Book book){
        return bookMapper.updateByPrimaryKey(book);
    }
    public Integer deleteByPrimaryKey(Integer id){
        return bookMapper.deleteByPrimaryKey(id);
    }
    public List<Book> selectByPrimaryKey(Integer id){
        return bookMapper.selectByPrimaryKey(id);
    }
}
