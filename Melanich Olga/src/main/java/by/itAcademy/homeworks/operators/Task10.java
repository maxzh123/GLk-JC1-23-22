package by.itAcademy.homeworks.operators;

import by.itAcademy.homeworks.utils.Printer;

/**
 * Задание 10
 * Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f.
 * Проверить, помещаются ли эти дома на данном участке.
 * Стороны домов – параллельны сторонам участка, в остальном размещение может быть любым.
 */

public class Task10 {
    public static void main(String[] args) {
        int a = 3;
        int b = 11;
        int c = 4;
        int d = 5;
        int e = 7;
        int f = 10;
        Printer.print(isLocationOfHouses(a, b, c, d, e, f));
    }
       // Возможны два варианта размещения домов на участке (вдоль ширины участка и вдоль длины участка).
       // Метод проверяет помещаются ли они на заданном участке.
       public static boolean isLocationOfHouses( int a, int b, int c, int d, int e, int f) {
           return ((a + c) <= e && b <= f && d <= f) || ((a + c) <= f && b <= e && d <= e);
    }
}
