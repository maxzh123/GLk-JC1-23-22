package by.itAcademy.homeworks.reflection;

import java.time.LocalDate;

public class Man {
    String name = "Ivan";
    String surName = "Ivanov";
    int age = 20;

    public String infoAboutMan(){
        return name + " " + surName + " " + age;
    }

    public int currentYear(){
        return LocalDate.now().getYear();
    }

    @AcademyInfo(year = "2022")
    public int currentYearForTask71(){
        return LocalDate.now().getYear();
    }

    public void printHelloWorld(String hello){
        System.out.println(hello);
    }
}
