package com.main.ovani4.patterns.factory.impl;

import com.main.ovani4.patterns.factory.Developer;

public class CppDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Cpp developer is coding");
    }
}
