package by.itAcademy.homeworks.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.DAY_OF_YEAR;

/** Задание 66
 * От текущей даты вывести на экран дату, которая была 60 дней назад.
 */

public class Task66 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");
        Calendar calendar = new GregorianCalendar(2022, 3, 4);
        calendar.roll(DAY_OF_YEAR, -60);
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
