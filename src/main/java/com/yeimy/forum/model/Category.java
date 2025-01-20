package com.yeimy.forum.model;

public enum Category {
    GENERAL_DISCUSSION("General_Discussion"),
    ANNOUNCEMENTS("Announcements"),
    TECH_SUPPORT("Tech_support"),
    OFF_TOPIC("Off_topic"),
    FEEDBACK("Feed_back");
    
    private String category;

    Category(String category) {
        this.category = category;
    }
}
