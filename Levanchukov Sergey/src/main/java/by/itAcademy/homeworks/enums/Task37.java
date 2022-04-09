package by.itAcademy.homeworks.enums;

import java.util.Locale;
import java.util.Scanner;

/**
 * > Написать метод, который в зависимости от сезона, выводит на экран сумму
 * > дней в этом сезоне. Входной параметр ввести с клавиатуры.
 **/

public class Task37 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String season=scanner.nextLine();
        Season season1=Season.valueOf(season.toUpperCase(Locale.ROOT));
        System.out.println(season1.getCountOfDays());
    }
}
