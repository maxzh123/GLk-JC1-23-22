package by.itAcademy.homeworks.enums;

/**
 * Задание 35
 * Создать enum, который описывает сезоны года. Добавить поле description в этот enum.
 * Добавить поле countOfDays в этот enum. Вывести на экран все константы сезоны года.
 *
 */

public class Task35 {
    public static void main(String[] args) {
        Season[] seasons = Season.values();
        for(Season season: seasons){
            System.out.println(season);
        }
    }
    }
