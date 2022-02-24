package by.itAcademy.homeworks.types;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.SECOND, input.nextInt());
        System.out.println("Seconds:"+calendar.get(Calendar.SECOND));
        System.out.println("Minutes:"+calendar.get(Calendar.MINUTE));
        System.out.println("Hours:"+calendar.get(Calendar.HOUR));
        System.out.println("Days:"+calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("Weeks:"+calendar.get(Calendar.WEEK_OF_YEAR));
    }
}
