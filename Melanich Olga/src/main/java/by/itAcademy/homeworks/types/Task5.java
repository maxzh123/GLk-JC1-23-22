package by.itAcademy.homeworks.types;

import by.itAcademy.interfaces.types.ITask5;

/**
 * Задание 5
 * Задать промежуток времени в сек в виде переменной. Вывести его на экран в виде часов минут и секунд, суток и недель.
 */
public class Task5 implements ITask5 {
    public static void main(String[] args) {
        int timeIntervalSeconds = 604862;
        int seconds = timeIntervalSeconds % 60;
        int m = (timeIntervalSeconds - seconds) / 60;
        int minutes = m % 60;
        int hours = (m - minutes) / 60;
        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
        int d = hours % 24;
        int days = (hours - d) / 24;
        int w = days % 7;
        int weeks = (days - w) / 7;
        System.out.println(days + " days " + weeks + " weeks");
    }
}
