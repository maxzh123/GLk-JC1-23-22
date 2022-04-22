package by.itAcademy.homeworks.loops;

import java.util.Scanner;

/**
 * Задание 14
 * Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
 */

public class Task14 {
    public static void main(String[] args) {

        long number = 7893823445L;
        int sum = 0;


        System.out.println("Сумма цифр числа " + number + " равна " + amount(number , sum) );
         }
     public static int amount (long number, int sum){

        do {
            sum += number % 10;
            number /= 10;
        }while (number != 0);
        return sum;

     }
}
