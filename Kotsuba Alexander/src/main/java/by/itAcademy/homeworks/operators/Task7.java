/*Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
 Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число).
 */

package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Введите значение переменной а: ");
        int a = sc.nextInt();
        System.out.println("Введите значение переменной b: ");
        int b = sc.nextInt();
        System.out.println("Введите значение переменной r: ");
        int r = sc.nextInt();
        if (r * r >= (a * a + b * b) / 4)
            System.out.println("Можно");
        else
            System.out.println("Нельзя");
    }
}
