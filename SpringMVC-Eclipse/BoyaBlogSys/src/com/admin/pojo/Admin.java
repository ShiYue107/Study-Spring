package com.admin.pojo;

import java.util.Date;

public class Admin {
    private Integer superid;

    private String supername;

    private String superpassword;

    private String phone;

    private String email;

    private Date date;

    public Integer getSuperid() {
        return superid;
    }

    public void setSuperid(Integer superid) {
        this.superid = superid;
    }

    public String getSupername() {
        return supername;
    }

    public void setSupername(String supername) {
        this.supername = supername == null ? null : supername.trim();
    }

    public String getSuperpassword() {
        return superpassword;
    }

    public void setSuperpassword(String superpassword) {
        this.superpassword = superpassword == null ? null : superpassword.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}