package by.itAcademy.homeworks.datetime;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * > От текущей даты вывести расписание всех встреч, которые происходят
 * > еженедельно в 13:00 в течение 2 месяцев.
 */

public class Task65 {
    public static void main(String[] args) {
        String firstMission = "Work";
        LocalDate today = LocalDate.now();
        LocalDate afterTwoMonth = today.plusMonths(2);
        LocalTime workTime = LocalTime.of(13, 00);
        if (workTime.getHour() == 13) {
            do {
                System.out.println("Day"+" "+today + " " + firstMission+ " at: "+workTime);
                today = today.plusWeeks(1);
            } while (today.isBefore(afterTwoMonth));
        }
    }
}
