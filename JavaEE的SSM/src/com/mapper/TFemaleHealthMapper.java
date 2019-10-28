package com.mapper;

import com.domain.TFemaleHealth;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TFemaleHealthMapper {
    int insert(TFemaleHealth record);
}