package com.mapper;

import com.domain.TEmployeeTask;

public interface TEmployeeTaskMapper {
    int insert(TEmployeeTask record);

    TEmployeeTask select(TEmployeeTask record);

}