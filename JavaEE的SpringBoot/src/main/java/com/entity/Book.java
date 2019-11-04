package com.entity;

import java.io.Serializable;

public class Book implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * author
     */
    private String author;

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}