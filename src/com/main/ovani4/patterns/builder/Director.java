package com.main.ovani4.patterns.builder;

public class Director {
    WebSiteBuilder builder;

    public void setBilder(WebSiteBuilder builder) {
        this.builder = builder;
    }
    Website bildWebsite(){
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrise();

        Website website = builder.getWebsite();

        return website;
    }
}
