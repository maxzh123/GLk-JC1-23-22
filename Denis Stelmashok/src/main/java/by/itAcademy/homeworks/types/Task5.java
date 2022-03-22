package by.itAcademy.homeworks.types;

public class Task5 {
    public static void main(String[] args) {
        int timeIntervalSeconds = 8000000;
        int seconds = timeIntervalSeconds % 60;
        int m = (timeIntervalSeconds - seconds) / 60;
        int minutes = m % 60;
        int hours = (m - minutes) / 60;
        System.out.println("hours " + hours + " minutes " + minutes + " seconds " + seconds);
        int d = hours % 24;
        int days = (hours - d) / 60;
        int w = days % 7;
        int weeks = (days - w) / 7;
        System.out.println(days + " days " + weeks + " weeks ");

    }
}
