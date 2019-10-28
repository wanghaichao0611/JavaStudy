package com.mapper;

import com.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insert(User record);
    User chooseWhenOtherwise(User record);

}