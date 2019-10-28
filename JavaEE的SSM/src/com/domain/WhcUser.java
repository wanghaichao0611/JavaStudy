package com.domain;

import java.io.Serializable;

public class WhcUser implements Serializable {
    private Integer 编号;

    private String 用户名;

    private String 密码;

    private static final long serialVersionUID = 1L;

    public Integer get编号() {
        return 编号;
    }

    public void set编号(Integer 编号) {
        this.编号 = 编号;
    }

    public String get用户名() {
        return 用户名;
    }

    public void set用户名(String 用户名) {
        this.用户名 = 用户名;
    }

    public String get密码() {
        return 密码;
    }

    public void set密码(String 密码) {
        this.密码 = 密码;
    }
}