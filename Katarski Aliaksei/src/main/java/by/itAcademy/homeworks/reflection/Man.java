package by.itAcademy.homeworks.reflection;

import java.time.LocalDate;

public class Man{
    private final String name="Алексей";
    private final String sName="Катарский";
    private final int age=26;


    public String getInfoAboutMan() {
        return name+" "+sName+" "+age;
    }
    public void printHelloWorld(String hello){
        System.out.println(hello);
    }
    @AcademyInfo(year = "2022")
    public void currentYear(){
        System.out.println(LocalDate.now().getYear());
    }
    public void currentYear_1(){
        System.out.println(LocalDate.now().getYear());
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", sName='" + sName + '\'' +
                ", age=" + age +
                '}';
    }
}


