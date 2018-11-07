/*
  Author: Administration-PC
  Date: 2018/11/07 11:13 
  Copyright ： all rights reserved  
*/
package com.fus.entity;



import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "Users")
public class UserEntity implements Serializable {
    private static final long serialVersionUID = -1L;

    private Long id;
    private String userName;
    private String passWord;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
