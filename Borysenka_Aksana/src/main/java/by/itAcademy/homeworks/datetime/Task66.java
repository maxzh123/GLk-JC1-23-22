package by.itAcademy.homeworks.datetime;

import java.time.LocalDate;

public class Task66 {

    /**Task66
     * От текущей даты вывести на экран дату, которая была 60 дней назад.
     */

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Текущая дата: " + date + ", " + "датa, которая была 60 дней назад: " + date.minusDays(60));
    }
}
