package com.main.ovani4.patterns.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBilder(new EnterpriseWrbsiteBuilder());
        Website website = director.bildWebsite();

        System.out.println(website);
    }
}
