package by.itAcademy.homeworks.loops;

/**
 * Задание 12
 * Вычислить факториал целых чисел от 0 до 10 с помощью цикла while
 */

public class Task12 {
    public static void main(String[] args) {
       System.out.println(factorial(10));
    }
    public static  int factorial(int a){
        int i = 1;
        int result = 1;
        while (i <= a){
            result = result * i;
            i++;
        }
       return result;

    }
}
