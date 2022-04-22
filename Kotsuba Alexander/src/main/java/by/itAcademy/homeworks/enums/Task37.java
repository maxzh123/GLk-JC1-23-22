/*Написать метод, который в зависимости от сезона, выводит на экран сумму дней в этом сезоне.
Входной параметр ввести с клавиатуры.*/

package by.itAcademy.homeworks.enums;

import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        System.out.println("Enter season name: ");
        Scanner sc = new Scanner(System.in);
        String season = sc.nextLine();
        Seasons_3 s = Seasons_3.valueOf(season);
        System.out.println(s.getCountOfDays());
    }
}
