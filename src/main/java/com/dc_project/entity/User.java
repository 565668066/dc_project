package com.dc_project.entity;

public class User {
    private String realName;
    private String id;
    private String college;
    private String username;
    private String password;
    private String email;

    public User(String realName, String id, String college, String username, String password, String email) {
        this.realName = realName;
        this.id = id;
        this.college = college;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User() {

    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
