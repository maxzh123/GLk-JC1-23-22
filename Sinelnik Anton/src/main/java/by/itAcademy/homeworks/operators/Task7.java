package by.itAcademy.homeworks.operators;


/** Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
 *  Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число). *
 */

public class Task7 {
    public static void main(String[] args) {
        int a = 65, b = 45, r = 38;
        if (2 * r >= Math.sqrt(a * a + b * b)) {
            System.out.println("можно");
        } else
            System.out.println("не можно");
    }
}




