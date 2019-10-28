package com.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.domain.WhcUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WhcUserMapper {
    int insert(WhcUser record);
    List<WhcUser> findAllBy编号(@Param("编号")Integer 编号);

}