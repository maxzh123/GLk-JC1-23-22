package by.itAcademy.homeworks.operators;

import java.util.Scanner;

/**
 * ## Задание 11
 * Написать метод, который выводит расписание на неделю. Задать на вход в
 * метод порядковый номер дня недели и отобразить на экране то, что запланировано
 * на этот день.
 */

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Расписание на неделю : \n Понедельник(1) Вторник(2) Среда(3) Четверг(4) Пятница(5) Суббота(6) Воскресенье(7)\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер дня недели от 1 до 7 : ");
        int day = scanner.nextInt();
        if (day < 0 || day > 7) {
            System.out.println("ОШИБКА!!! \n Введите число от 1 до 7");
            return;
        }
        if (day == 1) {
            System.out.println("В понедельник у Вас занятие в IT Academy с 18:30 до 21:30");
        } else if (day == 2) {
            System.out.println("Во вторник у Вас тренировка с 17:00 до 18:30");
        } else if (day == 3) {
            System.out.println("В среду Вы идете в кино. Начало сеанса в 19:30");
        } else if (day == 4) {
            System.out.println("В четверг у Вас занятие в IT Academy с 18:30 до 21:30");
        } else if (day == 5) {
            System.out.println("В пятницу у Вас совещание в 15:00");
        } else if (day == 6) {
            System.out.println("В субботу Вы весь день на даче");
        } else if (day == 7) {
            System.out.println("На воскресенье никаких дел не запланированно");
        }
    }
}


