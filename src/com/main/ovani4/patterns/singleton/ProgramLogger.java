package com.main.ovani4.patterns.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logfile = "Start log file: \n\n";

    public static synchronized ProgramLogger getProgramLogger(){
        if (programLogger == null){
            programLogger = new ProgramLogger();
        }return programLogger;
    }
    private ProgramLogger(){}
    public void addLog(String log){
        logfile += log + "\n";
    }
    public void showLogFile(){
        System.out.println(logfile);
    }
}
//паттерн гарантирует что будет создан только один экзепляр данного класса