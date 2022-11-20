package com.sxw.clone;

import java.util.Objects;

/**
 * @Author Frank
 * @project HomeWork
 * @Date 2022/11/5 8:13
 * @Version 1.0
 * 描述：   TODO
 */
public class User implements Cloneable{
    private String username;

    private String password;

    private User(){

    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {

        User user = (User) o;
        if (username.equals(user.username) && password.equals(user.password)){
            return true;
        }
        return false;
    }
}
