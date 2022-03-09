package by.itAcademy.homeworks.loops;

/**
 * ## Задание 12
 * Вычислить факториал целых чисел от 0 до 10 с помощью цикла while
 */

public class Task12 {
    public static void main(String[] args) {
        int value = 10;
        int result = factorial(value);
        System.out.println(result);


    }

    public static int factorial(int value) {
        int result = 1;
        int i = 1;
        while (i <= value) {
            result *= i;
            i++;
        }
        return result;
    }
}