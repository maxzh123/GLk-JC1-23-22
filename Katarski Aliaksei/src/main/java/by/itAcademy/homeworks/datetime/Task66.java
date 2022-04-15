package by.itAcademy.homeworks.datetime;

import java.time.LocalDate;

/**
 * > От текущей даты вывести на экран дату, которая была 60 дней назад.
 */
public class Task66 {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println(today.minusDays(60));
    }
}
