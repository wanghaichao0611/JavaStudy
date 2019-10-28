package com.mapper;

import com.domain.TWorkCard;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TWorkCardMapper {
    int insert(TWorkCard record);
}