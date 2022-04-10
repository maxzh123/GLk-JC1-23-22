package by.itAcademy.homeworks.datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

/** Задание 66
 * От текущей даты вывести на экран дату, которая была 60 дней назад.
 */

public class Task66 {
    public static void main(String[] args) {
        Calendar calendar=new GregorianCalendar();
        System.out.println(calendar.getTime());
        calendar.roll(Calendar.DAY_OF_YEAR,-60);
        System.out.println(calendar.getTime());
    }
}
