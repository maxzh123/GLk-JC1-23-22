package by.itAcademy.homeworks.operators;

/**
 * ## Задание 7
 * > Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
 * > Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже
 * > целое число).
 */

public class Task7 {
    public static void main(String[] args) {
        int a = 6;
        int b = 6;
        int perimetr = a * b;
        int r = 25;
        int diametr = r * 2;
        if (perimetr > diametr){
            System.out.println("Не закроет отверстие");
        }else
            System.out.println("Закроет отверстие");

    }
}
