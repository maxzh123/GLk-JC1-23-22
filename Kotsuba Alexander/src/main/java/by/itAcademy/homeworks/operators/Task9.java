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

    public static void dayOfMonth(int day,int month,int year){//Исправил,выводит теперь ВСЁ
        if(day == 31){
            System.out.println("Next day: " + 1 + " " +  ++month +" " +  year);
         } else if (day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
        System.out.println("Next day: " + 1 + " " + ++month + " " + year);
    } else if (day == 28 && month == 2) {
        System.out.println("Next day: " + 1 + " " + ++month + " " + year);
    } else if (day == 31 && month == 12) {
        System.out.println("Next day: " + 1 + " " + 1 + " " + ++year);
    } else if (day > 31 || month > 12 || (day > 28 && month == 2) || day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
        System.out.println("There is no day with such a date");
    } else {
        System.out.println("Next day: " + ++day + " " + month + " " + year);
    }
    }
}
