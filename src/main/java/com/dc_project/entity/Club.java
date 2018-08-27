package com.dc_project.entity;

public class Club {
    private String id;
    private String clubName;
    private String manager;
    private String buildTime;
    private String intro;

    public Club() {
    }

    public Club(String id, String clubName, String manager, String buildTime, String intro) {
        this.id = id;
        this.clubName = clubName;
        this.manager = manager;
        this.buildTime = buildTime;
        this.intro = intro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
