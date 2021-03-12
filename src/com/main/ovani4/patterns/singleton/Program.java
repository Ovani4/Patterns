package com.main.ovani4.patterns.singleton;

public class Program {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLog("123");
        ProgramLogger.getProgramLogger().addLog("222");
        ProgramLogger.getProgramLogger().addLog("34234");
        ProgramLogger.getProgramLogger().addLog("fswedfrw");
        ProgramLogger.getProgramLogger().showLogFile();

    }
}
