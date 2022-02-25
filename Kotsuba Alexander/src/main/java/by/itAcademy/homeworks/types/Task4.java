/*Написать метод, который принимает на вход два целых числа, делает их суммирование и складывает результат с
произведением двух этих чисел, и возвращает полученный результат из метода.
 Передать на вход в метод любые два числа. Вывести полученный результат работы метода на экран*/

package by.itAcademy.homeworks.types;

import java.util.Scanner;

public class Task4 {
    public static int sum(int a,int b){
        return (a + b) + (a * b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int c= sc.nextInt();
        System.out.println("Введите второе число: ");
        int d= sc.nextInt();
        System.out.println("Результат выражения: ");
        System.out.println(sum(c,d));
    }
}
