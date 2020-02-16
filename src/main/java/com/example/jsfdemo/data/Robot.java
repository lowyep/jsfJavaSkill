package com.example.jsfdemo.data;

import java.util.Date;

public class Robot {
    private Long id;
    private String name;
    private String type;
    private String weapon;
    private Date createdDate;
    private Date lastModifiedDate;

    public Robot() {
    }

    public Robot(Long id, String name, String type, String weapon, Date createdDate, Date lastModifiedDate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.weapon = weapon;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
