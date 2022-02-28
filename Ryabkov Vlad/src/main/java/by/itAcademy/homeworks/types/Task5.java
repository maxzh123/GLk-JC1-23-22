package by.itAcademy.homeworks.types;

/**
 * ## Задание 5
 * > Задать промежуток времени в секундах в виде переменной. Следует вывести
 * > его на экран в виде часов минут и секунд, суток и недель.
 */

public class Task5 {
    public static void main(String[] args) {
        int valueSeconds = 654_321;
        int seconds, valueMinute, minute, hour;
        seconds = valueSeconds % 60;
        valueMinute = (valueSeconds - seconds) / 60;
        minute = valueMinute % 60;
        int valueHours = (valueMinute - minute) / 60;
        hour = valueHours % 60;
        int days = valueHours / 24;
        int weeks = days / 7;
        System.out.println(weeks + " Неделя " + days + " дней " + hour + " час " + minute + " минут " + seconds + " Секунда");


    }
}
