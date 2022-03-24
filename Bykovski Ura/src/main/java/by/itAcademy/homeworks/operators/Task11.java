package by.itAcademy.homeworks.operators;

import java.util.Scanner;

//Написать метод, который выводит расписание на неделю. Задать на вход в метод порядковый номер дня недели и отобразить на экране то, что запланировано на этот день.
public class Task11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите расписание на Понедельник");
        String monday=sc.nextLine();
        System.out.println("Введите расписание на Вторник");
        String tuesday=sc.nextLine();
        System.out.println("Введите расписание на Среду");
        String wednesday=sc.nextLine();
        System.out.println("Введите расписание на Четверг");
        String thursday=sc.nextLine();
        System.out.println("Введите расписание на Пятницу");
        String friday=sc.nextLine();
        System.out.println("Введите расписание на Субботу");
        String saturday=sc.nextLine();
        System.out.println("Введите расписание на Воскресенье");
        String sunday=sc.nextLine();
        System.out.println("Введите номер дня недели");
        int a=sc.nextInt();
        if (a==1){
            System.out.println(monday);
        }
        if (a==2) {
            System.out.println(tuesday);
        }
        if (a==3) {
            System.out.println(wednesday);
        }
        if (a==4) {
            System.out.println(thursday);
        }
        if (a==5) {
            System.out.println(friday);
        }
        if (a==6) {
            System.out.println(saturday);
        }
        if (a==7) {
            System.out.println(sunday);
        }
        if (a>7){
            System.out.println("Неверные данные");
        }
    }
}
