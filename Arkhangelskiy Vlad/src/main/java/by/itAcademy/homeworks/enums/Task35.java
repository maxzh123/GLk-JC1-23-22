package by.itAcademy.homeworks.enums;
/**
 * Task 35
 * Создать enum, который описывает сезоны года. Добавить поле description в этот enum.
 * Добавить поле countOfDays в этот enum. Вывести на экран все константы сезоны года.
 * Task 36
 * Написать метод, который выводит следующий сезон от заданного во входном параметре. Входной параметр ввести с клавиатуры.
 * Task 37
 * Написать метод, который в зависимости от сезона, выводит на экран сумму дней в этом сезоне. Входной параметр ввести с клавиатуры.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task35 {

    public static void main(String[] args) throws IOException {


        System.out.println(Season.FALL);
        System.out.println(Season.WINTER);
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВедите сезон года (SUMMER, WINTER, FALL, SPRING)");
        String str = reader.readLine();

        Season season = Season.valueOf(str);
        Season nextSeason = Season.getNextSeason(season);

        System.out.println("Следуйщий за введенным сезоном " + nextSeason.name());

        System.out.println("Количество дней в сезоне " +season.name() +" " + season.getCountOfDays());

    }
}
