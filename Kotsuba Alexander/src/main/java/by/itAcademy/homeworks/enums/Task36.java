/*Написать метод, который выводит следующий сезон от заданного во входном параметре.
Входной параметр ввести с клавиатуры.*/
package by.itAcademy.homeworks.enums;

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        System.out.println("Enter the name of the season: ");
        Scanner sc = new Scanner(System.in);
        String season = sc.nextLine();
        SeasonsNumberTwo.getNextSeason(season);
    }
}
