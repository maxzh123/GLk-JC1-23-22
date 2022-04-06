package by.itAcademy.homeworks.datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Задание 64
 * Ввести с клавиатуры номер месяца текущего года. Вывести на экран все его даты в формате d::MMM::yyyy.
 */

public class Task64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        SimpleDateFormat dateFormat = new SimpleDateFormat("d::MMM::yyyy");
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        do {
            System.out.println(dateFormat.format(calendar.getTime()));
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        while (calendar.get(Calendar.DAY_OF_MONTH) > 1);
    }
}


