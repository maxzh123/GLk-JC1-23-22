package by.itAcademy.homeworks.operators;

/**
 * Задание 11
 * Написать метод, который выводит расписание на неделю.
 * Задать на вход в метод порядковый номер дня недели и отобразить на экране то, что запланировано на этот день.
 */

public class Task11 {
    public static void main(String[] args) {
        System.out.println(weekschedule(5));
    }
    public static String weekschedule(int day) {
        String schedule = "";
        switch (day) {
            case 1:
                schedule = "Расписание на понедельник";
                break;
            case 2:
                schedule = "Расписание на вторник";
                break;
            case 3:
                schedule = "Расписание на среду";
                break;
            case 4:
                schedule = "Расписание на четверг";
                break;
            case 5:
                schedule = "Расписание на пятницу";
                break;
            case 6:
                schedule = "Расписание на субботу";
                break;
            case 7:
                schedule = "Расписание на воскресенье";
                break;
            default:
                schedule = "В неделе только 7 дней";
        }
    return schedule;
    }
}
