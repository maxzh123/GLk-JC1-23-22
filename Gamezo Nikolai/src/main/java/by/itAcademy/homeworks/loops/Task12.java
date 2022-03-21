package by.itAcademy.homeworks.loops;

/**
 * Задание 12
 * Вычислить факториал целых чисел от 0 до 10 с помощью цикла while
 */

public class Task12 {
    public static void main(String[] args) {
        int i = 1;
        int fact = 1;
        while (i <= 10){
            fact = fact * i;
            i++;
        }
        System.out.println("Факториал = " + fact);
    }
}
