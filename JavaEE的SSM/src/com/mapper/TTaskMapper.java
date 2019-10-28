package com.mapper;

import com.domain.TTask;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TTaskMapper {
    int insert(TTask record);
}