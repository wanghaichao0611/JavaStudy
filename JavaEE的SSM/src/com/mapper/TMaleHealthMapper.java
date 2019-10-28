package com.mapper;

import com.domain.TMaleHealth;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TMaleHealthMapper {
    int insert(TMaleHealth record);
}