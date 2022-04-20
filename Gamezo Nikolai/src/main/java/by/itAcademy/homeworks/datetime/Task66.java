package by.itAcademy.homeworks.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Задание 66
 * От текущей даты вывести на экран дату, которая была 60 дней назад.
 */

public class Task66 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("60 дней назад было " + date.minusDays(60).format(DateTimeFormatter.ofPattern("d MMMM uuuu")));
    }
}
