package by.itAcademy.homeworks.operators;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        Scanner scanner = new Scanner(System.in);
        calendar.set(Calendar.DAY_OF_MONTH,scanner.nextInt());
        calendar.set(Calendar.MONTH,scanner.nextInt());
        calendar.set(Calendar.YEAR,scanner.nextInt());
        calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH)+1);
        System.out.println("Date of the next day: "+calendar.get(Calendar.DAY_OF_MONTH)+"."
                          +calendar.get(Calendar.MONTH)+"."
                          +calendar.get(Calendar.YEAR));
    }
}
