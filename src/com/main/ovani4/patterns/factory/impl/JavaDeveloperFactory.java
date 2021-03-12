package com.main.ovani4.patterns.factory.impl;

import com.main.ovani4.patterns.factory.Developer;
import com.main.ovani4.patterns.factory.DeveloperFactory;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
