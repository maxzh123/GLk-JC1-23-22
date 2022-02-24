package by.itAcademy.homeworks.operators;

/**
 * ## Задание 7
 * > Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
 * > Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже
 * > целое число).
 */

public class Task7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int p = a * b; //площадь прямоугольника = 60
        int r = 6;
        double pr = Math.PI * (r * r); // площадь круга = 113
        boolean b1;
        if (pr < p) {
            b1 = false;
            System.out.println(b1);
        } else {
            b1 = true;
            System.out.println(b1);   // ответ true
        }
    }
}
