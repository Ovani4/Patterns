package com.main.ovani4.patterns.builder;

public class EnterpriseWrbsiteBuilder extends WebSiteBuilder{
    @Override
    void buildName() {
    website.setName("Enterprise web site");
    }

    @Override
    void buildCms() {
    website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrise() {
    website.setPrise(15000);
    }
}
