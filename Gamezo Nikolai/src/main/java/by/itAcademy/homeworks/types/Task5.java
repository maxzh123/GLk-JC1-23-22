package by.itAcademy.homeworks.types;

/** Задание 5
 Задать промежуток времени в секундах в виде переменной. Следует вывести его на экран в виде часов минут и секунд, суток и недель.
 */

public class Task5 {
    public static void main(String[] args) {
        int sec = 123456789;
        int min = sec/60;
        int hour = sec/3600;
        int day = sec/86400;
        int week = sec/604800;
        System.out.println(sec + " секунд это: " + "\n" + min + " минут " + "\n" + hour + " часов " + "\n" + day + " суток " + "\n" + week + " недель ");
    }
}
