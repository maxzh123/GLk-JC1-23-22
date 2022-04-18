package by.itAcademy.homeworks.exceptions;

import java.util.Scanner;

/**
 * Задание 44
 * Написать собственное исключение от Exception.
 * Сгенерировать код, который будет выбрасывать его и обрабатывать.
 * Результат работы программы вывести на экран.
 */

public class Task44 {
    public static void main(String[] args) {
        System.out.print("Введите число для вычисления факториала: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        try {
            int result = getFactorial(num);
            System.out.println(num + "! = " + result);
        }
        catch (Exception exс) {
            System.out.println(exс.getMessage());
        }
    }
    public static int getFactorial(int num) throws Exception {
        if (num < 0) throw new Exception ("Число меньше 0");
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }
}

