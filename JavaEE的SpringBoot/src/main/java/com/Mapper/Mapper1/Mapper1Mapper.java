package com.Mapper.Mapper1;

import com.entity.Mapper1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Mapper1Mapper {
    Mapper1 selectByPrimaryKey(Integer id);
    List<Mapper1> getAll();
}