package com.mapper;

import com.domain.TRole;
import com.domain.PdCountRoleParams;
import org.springframework.stereotype.Repository;

@Repository
public interface TRoleMapper {
    int insert(TRole record);
    void countRole(PdCountRoleParams record);
}