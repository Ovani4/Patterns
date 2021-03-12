package com.main.ovani4.patterns.factory.impl;

import com.main.ovani4.patterns.factory.Developer;

public class SqlDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("SQL developer is coding");
    }
}
