package com.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class User implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * 用户工资
     */
    private BigDecimal money;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}