package com.dc_project.entity;

import java.sql.Date;

public class ClubMessage {
    private String clubName;
    private String content;
    private String newsTime;
    private String manager;
    private String contact;
    private int id;
    private String title;

    public ClubMessage() {
    }

    public ClubMessage(String clubName, String content, String newsTime, String manager, String contact, int id, String title) {
        this.clubName = clubName;
        this.content = content;
        this.newsTime = newsTime;
        this.manager = manager;
        this.contact = contact;
        this.id = id;
        this.title = title;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
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
