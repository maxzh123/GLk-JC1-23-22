package by.itAcademy.homeworks.enums;

import java.util.Scanner;
/**Написать метод, который выводит следующий сезон от заданного во входном параметре. Входной параметр ввести с клавиатуры.*/
public class Task36 {
    public static void main(String[] args) {
        System.out.print("Введите сезон: ");
        Scanner sc = new Scanner(System.in);
        Season season = Season.valueOf(sc.nextLine().toUpperCase());
        System.out.println(Season.nextSeason(season));
    }
}
