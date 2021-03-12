package com.main.ovani4.patterns.factory.impl;

import com.main.ovani4.patterns.factory.Developer;

public class JavaDeveloper implements Developer {


    @Override
    public void writeCode() {
        System.out.println("Java developer is coding");
    }
}
