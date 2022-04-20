package by.itAcademy.homeworks.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Задание 64
 * Ввести с клавиатуры номер месяца текущего года. Вывести на экран все его даты в формате d::MMM::uuuu.
 */

public class Task64 {
    public static void main(String[] args) {
        System.out.print("Введите номер месяца текущего года: ");
        Scanner scan = new Scanner(System.in);
        int month= scan.nextInt();
        printDate(month);
    }
    public static LocalDate printDate(int month) {
        LocalDate localDate = LocalDate.now();
        LocalDate date = LocalDate.of(localDate.getYear(), month, 1);
        int i = 0;
        //переходит на 1 число после последнего
        for (;date.getDayOfMonth() > i; i++) {
            System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMMM::uuuu")));
            date = date.plusDays(1);
        }
        return date;
    }
}
