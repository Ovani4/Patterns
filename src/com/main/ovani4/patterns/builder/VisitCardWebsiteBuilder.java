package com.main.ovani4.patterns.builder;

public class VisitCardWebsiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        website.setName("VisitCard");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);

    }

    @Override
    void buildPrise() {
        website.setPrise(500);

    }
}
