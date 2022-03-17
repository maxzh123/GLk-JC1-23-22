package by.itAcademy.homeworks.types;

import by.itAcademy.interfaces.types.ITask4;

/**
 * Задание 4
 * Метод принимает на вход два целых числа, суммирует их и складывает результат с произведением этих чисел.
 * Вывести результат на экран.
 */

public class Task4 implements ITask4 {
    public static void main(String[] args) {
        int count1 = 10;
        int count2 = 20;
        System.out.println(sumNumbers(count1, count2));
    }

    public static int sumNumbers(int a, int b) {
        int sum = (a + b) + (a * b);
        return sum;
    }
}
