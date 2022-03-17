package by.itAcademy.homeworks.operators;

import java.util.Scanner;

/** Написать метод, который выводит расписание на неделю.
 *  Задать на вход в метод порядковый номер дня недели и отобразить на экране то,
 *  что запланировано на этот день.
 */

public class Task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введи номер дня от 1 до 7");
        int day = s.nextInt();
        switch (day) {
            case 1:
                System.out.println("Расписание на понедельник: делай домашку по Java и иди на занятия");
                break;
            case 2:
                System.out.println("Расписание на вторник: учи Java");
                break;
            case 3:
                System.out.println("Расписание на среду: тренеруйся в Java");
                break;
            case 4:
                System.out.println("Расписание на четверг: делай домашку по Java и иди на занятия");
                break;
            case 5:
                System.out.println("Расписание на пятницу: учи Java ");
                break;
            case 6:
                System.out.println("Расписание на субботу: тренеруйся в Java ");
                break;
            case 7:
                System.out.println("Расписание на воскрксенье: отдыхай");
                break;
            default:
                System.out.println("дня с таким порядковым номером не существует");
        }
    }
}
