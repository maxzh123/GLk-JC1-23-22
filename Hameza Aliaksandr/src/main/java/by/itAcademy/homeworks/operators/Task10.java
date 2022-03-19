package by.itAcademy.homeworks.operators;
/**
 * Задание 10
 * Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f. Проверить, помещаются ли эти дома на данном участке.
 * Стороны домов – параллельны сторонам участка, в остальном размещение может быть любым.
 */

public class Task10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 7;
        int d = 8;
        int e = 6;
        int f = 2;
        int areaofhouseone = a * b;
        int areaofhousetwo = c * d;
        int areaofland = e * f;
        if (areaofhouseone+areaofhousetwo > areaofland ){
            System.out.println("Нельзя вместить");
        } else System.out.println("Можно поместить");

    }

}
