package by.itAcademy.homeworks.operators;
/**
 * Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату следующего дня.
 */

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task9 {
    public static void main(String[] args) {
        int day =4;
        int month =3;
        int year =2022;
        GregorianCalendar calendar = new GregorianCalendar(year, month , day+1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + " " + calendar.get(Calendar.MONTH) + " " + calendar.get(Calendar.YEAR));
    }
}
