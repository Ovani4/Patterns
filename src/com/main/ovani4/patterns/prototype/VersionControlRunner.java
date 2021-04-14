package com.main.ovani4.patterns.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "System.out.println(Hey!);");
        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println("+++++++++++++++");
        System.out.println(masterClone);
    }
}
