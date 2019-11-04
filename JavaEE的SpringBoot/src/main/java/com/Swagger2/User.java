package com.Swagger2;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户实体类",description = "用户信息描述类")
public class User {
    @ApiModelProperty(value = "用户名")
    private String address;
    @ApiModelProperty(value = "用户地址")
    private String username;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
