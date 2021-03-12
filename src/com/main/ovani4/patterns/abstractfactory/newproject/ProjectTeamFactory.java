package com.main.ovani4.patterns.abstractfactory.newproject;

import com.main.ovani4.patterns.abstractfactory.Developer;
import com.main.ovani4.patterns.abstractfactory.Manager;
import com.main.ovani4.patterns.abstractfactory.Tester;

public class ProjectTeamFactory implements com.main.ovani4.patterns.abstractfactory.ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getManager() {
        return new com.main.ovani4.patterns.abstractfactory.newproject.Manager();
    }
}
