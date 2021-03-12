package com.main.ovani4.patterns.abstractfactory.newproject;

import com.main.ovani4.patterns.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer is coding");
    }
}
