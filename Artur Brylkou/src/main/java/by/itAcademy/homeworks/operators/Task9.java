package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день:");
        int day = sc.nextInt();
        System.out.println("Введите месяц:");
        int month = sc.nextInt();
        System.out.println("Введите год:");
        int year = sc.nextInt();
        System.out.println("Указанная дата "+day+"/"+month+"/"+year);
        if (checkEnterDAy(day,month,year)){
            System.out.println("Введите корректную дату ");
        }else{
            System.out.println("Дата следующего дня: "+nextDayData(day,month,year));
        }
    }
    public static boolean checkEnterDAy(int day, int month, int year){
        return ((month > 12) || (day > 31) || ((day > 29) && (month == 2)) || ((day == 29) && !isLeapYear(year)));
    }
    public static boolean isLeapYear(int year) {return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));

    }
    public static String nextDayData(int day,int month, int year){
        if ((day == 28) && (month == 2) && !isLeapYear(year)) {
            day = 1;
            month++;
        } else if ((day == 28) && (month == 2) && isLeapYear(year)) {
            day++;
        } else if (day == 29 && month == 2) {
            day = 1;
            month++;
        } else if ((day == 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
            day = 1;
            month++;
        } else if ((day == 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
            day = 1;
            month++;
        } else if ((day == 31) && month == 12) {
            day = 1;
            month = 1;
            year++;
        } else {
            day++;
        }
        return day + "/" + month + "/" + year;
    }
}
