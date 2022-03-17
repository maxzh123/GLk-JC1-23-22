package by.itAcademy.homeworks.loops;

/**
 * Задание 14
 * Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
 */

public class Task14 {
    public static void main(String[] args) {
        long number = 7893823445l;
        long sum = 0;
        do{
            sum = sum + number % 10;
            number = number / 10;
        }
        while (number > 0);
        System.out.println("Сумма = " + sum);
    }
}
