package by.itAcademy.homeworks.enums;

import java.util.Locale;
import java.util.Scanner;

/**
 * Написать метод, который в зависимости от сезона, выводит на экран сумму
 * > дней в этом сезоне. Входной параметр ввести с клавиатуры.
 */
public class Task37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sc_1=sc.nextLine();
        Seasons seasons=Seasons.valueOf(sc_1.toUpperCase(Locale.ROOT));
        Seasons.getSumOfDays(seasons);
    }
}
