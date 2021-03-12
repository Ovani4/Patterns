package com.main.ovani4.patterns.abstractfactory;

import com.main.ovani4.patterns.abstractfactory.newproject.ProjectTeamFactory;

public class CreateNewProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new ProjectTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getManager();

        System.out.println("Project is creating...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
