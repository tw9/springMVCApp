package com.finance.beans;

import org.springframework.stereotype.Repository;

/**
 * Created by taylor on 7/16/15.
 */
@Repository
public class User {

/*
CREATE TALBE USER(
ID INTEGER,
REALNAME VARCHAR(20),
LOGINNAME VARCHAR(20),
PASSWORD  VARCHAR(50),
PHONE VARCHAR(20),
EMAIL VARCHAR(50),
ADDRESS VARCHAR(300)

)
*/



    private Integer id;
    private String realname;
    private String loginname;
    private String password;
    private String phone;
    private String email;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
