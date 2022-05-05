package by.itAcademy.homeworks.patterns;

import java.time.LocalDate;

public class Singleton {
    private static Singleton sn;

    public static Singleton getSn(){
        if(sn==null){
            sn=new Singleton();
        }
        return sn;
    }
}

