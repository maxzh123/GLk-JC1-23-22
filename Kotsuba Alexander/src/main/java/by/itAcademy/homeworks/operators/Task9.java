/*Задать три числа – день, месяц, год.
Вывести на экран в виде трех чисел дату следующего дня.*/

package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        day++;
        System.out.println(day+" " + month+" " + year);
    }
}
