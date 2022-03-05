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
        dayOfMonth(day,month,year);
    }

    public static void dayOfMonth(int day,int month,int year){
        if(day == 31){
            System.out.println("Next day: " + 1 + " " +  ++month +" " +  year);
        }
    }
}
