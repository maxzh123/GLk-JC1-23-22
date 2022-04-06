package by.itAcademy.homeworks.datetime;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * От текущей даты вывести расписание всех встреч, которые происходят
 * еженедельно в 13:00 в течение 2 месяцев.
 */
public class Task65 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime meets = LocalTime.of(13, 00);
        LocalDate date = LocalDate.now();
        LocalDate date2 = date.plusMonths(2);
        String str = "Meeting";

        if (now.compareTo(meets) == 1) {
            date = date.plusDays(7);
            date2 = date2.plusDays(7);
        }
        do {
            System.out.println(date.toString() + " " + str);
            date=date.plusDays(7);
        }while (date.isBefore(date2));
    }
}
