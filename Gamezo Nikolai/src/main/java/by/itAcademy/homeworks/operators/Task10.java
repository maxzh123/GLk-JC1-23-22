package by.itAcademy.homeworks.operators;
/**
 * Задание 10
 * Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f. Проверить, помещаются ли эти дома на данном участке.
 * Стороны домов – параллельны сторонам участка, в остальном размещение может быть любым.
 */

public class Task10 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 6;
        int f = 6;
        if ((a + c <= e && b + d <= f) && (a + c<= f && b + d <= e) && (a + d <= f && b + c <= e) && (a + d <= e && b + c <=f)) {
            System.out.println("Дома помещаются на участок");
        }
        else {
            System.out.println("Дома не помещаются на участок");
        }
    }
}

