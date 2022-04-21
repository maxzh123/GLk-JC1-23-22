package by.itAcademy.homeworks.operators;

/**
 *Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату следующего дня.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите день месяца");
        int day = sc.nextInt();

        System.out.println("Введите месяц года");
        int month = sc.nextInt();

        System.out.println("Год");
        int year = sc.nextInt();

        Calendar calendar = new GregorianCalendar();
            calendar.set(Calendar.DAY_OF_MONTH, day + 1);
            calendar.set(Calendar.MONTH, month -1);
            calendar.set(Calendar.YEAR, year);
           // calendar.add(Calendar.DAY_OF_MONTH, +1);

            System.out.println(calendar.getTime());
    }
}
