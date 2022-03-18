package by.itAcademy.homeworks.operators;

import java.util.Calendar;
import java.util.GregorianCalendar;

/** Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату следующего дня.
 */
public class Task9 {
    public static void main(String[] args) {
        int day =8;
        int month  =3;
        int year =2022;
        GregorianCalendar calendar = new GregorianCalendar(year,month,day+1);
        System.out.println(calendar.get(calendar.YEAR) + " " + calendar.get(Calendar.MONTH) + " " + calendar.get(Calendar.DAY_OF_MONTH));

    }
}
