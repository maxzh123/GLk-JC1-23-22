package by.itAcademy.homeworks.enums;

import java.util.Arrays;

/**
 * Задание 35
 * Создать enum, который описывает сезоны года. Добавить поле description в этот enum.
 * Добавить поле countOfDays в этот enum. Вывести на экран все константы сезоны года.
 */

public class Task35 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Seasons.values()));

        for (Seasons s : Seasons.values())
            System.out.println(s + ": " + s.getDescription() + " " + s.getCountOfDays() + "days");
    }
}
