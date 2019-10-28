package com.mapper;

import com.domain.TEmployee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TEmployeeMapper {
    int insert(TEmployee record);
    TEmployee selectA(TEmployee record);
}