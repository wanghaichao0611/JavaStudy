package com.Mapper.Mapper1;

import com.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper
{
    Integer deleteByPrimaryKey(Integer id);
    Integer insert(Book book);
    List<Book> selectByPrimaryKey(Integer id);
    Integer updateByPrimaryKey(Book record);
}