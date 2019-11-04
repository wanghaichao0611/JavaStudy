package com.Mapper.Mapper2;

import com.entity.Mapper2;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Mapper2Mapper {
    List<Mapper2> getAll();
}