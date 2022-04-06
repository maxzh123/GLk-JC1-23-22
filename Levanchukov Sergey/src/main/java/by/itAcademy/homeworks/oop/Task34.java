package by.itAcademy.homeworks.oop;

import by.itAcademy.homeworks.oop.ForTask34.Boss;
import by.itAcademy.homeworks.oop.ForTask34.Engineer;
import by.itAcademy.homeworks.oop.ForTask34.Workman;

public class Task34 {
    public static void main(String[] args) {
        Boss boss1=new Boss("Ivan","Ivanov",62,130,168);
        System.out.println("Фамилия: "+boss1.getSurname()+"\n"+"Имя: "+ boss1.getName()+"\n"+
                "Возраст: "+ boss1.getAge()+"\n"+"Норма отработанного времени в месяц: "+ boss1.getStandardWorkingTime()+
                "\n"+"Фактически отработанное время: "+boss1.getActualWorkingTime()+"\n"+"Занимаемая должность: "+ boss1.getPost());
        boss1.work();

        System.out.print("\n");

        Engineer engineer1=new Engineer("Alex","Petrov",30,150,168);
        System.out.println("Фамилия: "+engineer1.getSurname()+"\n"+"Имя: "+ engineer1.getName()+"\n"+
                "Возраст: "+ engineer1.getAge()+"\n"+"Норма отработанного времени в месяц: "+ engineer1.getStandardWorkingTime()+
                "\n"+"Фактически отработанное время: "+engineer1.getActualWorkingTime()+"\n"+"Занимаемая должность: "+ engineer1.getPost());
        engineer1.work();

        System.out.print("\n");

        Workman workman1=new Workman("Victor","Comarov",54,190,168);
        System.out.println("Фамилия: "+workman1.getSurname()+"\n"+"Имя: "+ workman1.getName()+"\n"+
                "Возраст: "+ workman1.getAge()+"\n"+"Норма отработанного времени в месяц: "+ workman1.getStandardWorkingTime()+
                "\n"+"Фактически отработанное время: "+workman1.getActualWorkingTime()+"\n"+"Занимаемая должность: "+ workman1.getPost());
        workman1.work();
    }
}
