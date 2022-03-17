package by.itAcademy.homeworks.types;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите интервал в секундах");
        int sec = sc.nextInt();
        System.out.println("Недель = "+ sec/604800 + " или Суток = " + sec/86400 + " или Часов " + sec/3600 +
                " или Минут = " + sec/60 + " или Секунд = " + sec);
    }
}
