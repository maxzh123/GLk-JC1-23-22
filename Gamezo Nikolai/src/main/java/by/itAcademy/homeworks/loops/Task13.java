package by.itAcademy.homeworks.loops;

/**
 * Задание 13
 * Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
 */

public class Task13 {
    public static void main(String[] args) {
        int i = 1;
        double fact = 1;
        do{
            fact = fact * i;
            i++;
        }
        while (i <= 25);
        System.out.println("Факториал = " + fact);
    }
}
