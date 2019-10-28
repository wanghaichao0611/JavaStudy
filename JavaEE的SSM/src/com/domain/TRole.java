package com.domain;

import java.io.Serializable;

public class TRole {
    /**
    * id
    */
    private Long id;

    /**
    * roleName
    */
    private String roleName;

    /**
    * note
    */
    private String note;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}