package com.main.ovani4.patterns.factory;

import com.main.ovani4.patterns.factory.impl.CppDeveloperFactory;
import com.main.ovani4.patterns.factory.impl.JavaDeveloperFactory;
import com.main.ovani4.patterns.factory.impl.SqlDeveloperFactory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();

        DeveloperFactory developerFactory1 = createDeveloperBySpecialty("sql");
        Developer developer1 = developerFactory1.createDeveloper();
        developer1.writeCode();
    }
    static DeveloperFactory createDeveloperBySpecialty (String specialty){
        if (specialty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }else if (specialty.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        }else if (specialty.equalsIgnoreCase("sql")){
            return new SqlDeveloperFactory();
        }
        else {
            throw new RuntimeException(specialty + " is unknown specialty");
        }
    }
}
