package com.dc_project.entity;

import java.sql.Date;

public class SchoolMessage {
    private String department;
    private String content;
    private String newsTime;
    private String manager;
    private String contact;
    private int id;
    private String title;

    public SchoolMessage() {
    }

    public SchoolMessage(String department, String content, String newsTime, String manager, String contact, int id, String title) {
        this.department = department;
        this.content = content;
        this.newsTime = newsTime;
        this.manager = manager;
        this.contact = contact;
        this.id = id;
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(String newsTime) {
        this.newsTime = newsTime;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
