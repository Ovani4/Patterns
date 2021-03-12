package com.main.ovani4.patterns.factory.impl;

import com.main.ovani4.patterns.factory.Developer;
import com.main.ovani4.patterns.factory.DeveloperFactory;

public class SqlDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new SqlDeveloper();
    }
}
