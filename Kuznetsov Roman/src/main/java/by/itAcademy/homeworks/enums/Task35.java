package by.itAcademy.homeworks.enums;

public class Task35 {
    public static void main(String args[]) {
        for (Seasons season: Seasons.values()) {
            System.out.println(Seasons.displayingInfoAboutSeason(season));
        }
    }
}
