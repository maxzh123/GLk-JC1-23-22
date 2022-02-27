/*Задать промежуток времени в секундах в виде переменной.
 Следует вывести его на экран в виде часов минут и секунд, суток и недель.*/

package by.itAcademy.homeworks.types;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Введите количество секунд: ");
        int sec = sc.nextInt();
        int minute = sec/60;
        int hour = sec/3600;
        int days = sec/86400;
        int weeks = sec/604800;
        System.out.println("Минут: " + minute + "; часов: " + hour +
                "; дней: " + days + "; недель: " + weeks);

    }
}
