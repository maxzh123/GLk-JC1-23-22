/*Посчитать сумму цифр числа 7893823445 с помощью цикла do while.*/

package by.itAcademy.homeworks.loops;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long i = sc.nextLong();
        long sum = 0;
        do{
            sum = sum + (i % 10);

        }while ((i/=10) != 0);
        System.out.println(sum + " ");
    }
}
