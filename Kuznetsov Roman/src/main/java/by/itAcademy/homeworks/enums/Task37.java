package by.itAcademy.homeworks.enums;

import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        Scanner bebro = new Scanner(System.in);
        String str = bebro.nextLine();
        Seasons season = Seasons.valueOf(str.toUpperCase());
        System.out.println("Количество дней в этом сезоне: " + Seasons.getCountOfDaysInSeason(season));
    }
}
