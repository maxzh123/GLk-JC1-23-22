package by.itAcademy.homeworks.operators;

import java.util.Scanner;

/**
 * Задание 7
 * Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа. Определить, можно ли его полностью закрыть
 * круглой картонкой радиусом r (тоже целое число).
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(closeCircle(a, b, r));
    }

        public static boolean closeCircle(int a, int b, int r) {
        int diameter = 2 * r;
        int hypotenuse = (int) Math.sqrt(a * a + b * b);
        if (diameter >= hypotenuse) {
            return true;
        } else {
            return false;
        }
    }
}
