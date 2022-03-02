package by.itAcademy.homeworks.operators;

import java.util.Scanner;

/**
 * Задание 6
 * Создайть метод с одним целочисленным параметром. Метод определяет, является ли последняя цифра числа семеркой,
 * возвращает boolean значение.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int count = in.nextInt();
        System.out.println(checkLastNumber(count));
    }

    public static boolean checkLastNumber(int a) {
        if (a % 10 == 7) {
            return true;
        } else {
            return false;
        }
    }
}
