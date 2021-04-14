package com.main.ovani4.patterns.builder;

public abstract class WebSiteBuilder {

    Website website;

    void createWebsite(){
        website = new Website();
    }
    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrise();
    Website getWebsite(){
        return website;
    }
}
