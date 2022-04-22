package by.itAcademy.homeworks.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Задание 65
 * От текущей даты вывести расписание всех встреч, которые происходят еженедельно в 13:00 в течение 2 месяцев.
 */

public class Task65 {
    public static void main(String[] args) {
        LocalDateTime currentDate = LocalDateTime.now();
        LocalDateTime startDate = LocalDateTime.of(LocalDate.from(currentDate), LocalTime.of(13, 00));
        LocalDateTime endDate = startDate.plusMonths(2);
        int i = 1;
        while(startDate.isBefore(endDate)) {
            System.out.println(startDate.format(DateTimeFormatter.ofPattern("d MMMM uuuu в HH:mm")) + " Очень важная встреча № " + i);
            startDate = startDate.plusWeeks(1);
            i++;
        }
    }
}
