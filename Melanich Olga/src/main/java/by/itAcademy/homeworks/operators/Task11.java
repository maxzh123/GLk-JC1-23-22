package by.itAcademy.homeworks.operators;

import by.itAcademy.homeworks.utils.Printer;

import java.util.Scanner;

/**
 * Задание 11
 * Написать метод, который выводит расписание на неделю. Задать на вход порядковый номер дня недели.
 * Отобразить на экране то, что запланировано на этот день.
 */

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Printer.print("Enter the day of the week from 1 to 7: ");
        int day = in.nextInt();
        Printer.print(getWeekSchedule(day));
    }

    public static String getWeekSchedule(int number) {
        String day = "";
        switch (number) {
            case 1:
                day = "Понедельник: рабочий день";
                break;
            case 2:
                day = "Вторник: рабочий день";
                break;
            case 3:
                day = "Среда: рабочий день";
                break;
            case 4:
                day = "Четверг: рабочий день";
                break;
            case 5:
                day = "Пятница: рабочий день";
                break;
            case 6:
                day = "Суббота: выходной день";
                break;
            case 7:
                day = "Воскресенье: выходной день";
                break;
            default:
                day = "Неверное значение";
        }
        return day;
    }
}