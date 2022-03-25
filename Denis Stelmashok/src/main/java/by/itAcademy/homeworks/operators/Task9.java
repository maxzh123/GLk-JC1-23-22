package by.itAcademy.homeworks.operators;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int mouth = sc.nextInt();
        int year = sc.nextInt();
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, mouth - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.DAY_OF_MONTH, + 1);
        System.out.println(calendar.getTime());
    }
}

