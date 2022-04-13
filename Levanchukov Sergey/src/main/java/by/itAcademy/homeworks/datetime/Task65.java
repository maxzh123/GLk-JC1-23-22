package by.itAcademy.homeworks.datetime;

import java.time.LocalDate;
import java.time.LocalTime;

/** Задание 65
 * От текущей даты вывести расписание всех встреч, которые происходят еженедельно в 13:00 в течение 2 месяцев.
 */

public class Task65 {
    public static void main(String[] args) {
        LocalDate localDateToday= LocalDate.now();
        LocalDate dateTwoMonthsLate=localDateToday.plusMonths(2);
        LocalTime localTime= LocalTime.of(13,00);

        do{
            System.out.println("Day: "+localDateToday+" "+localTime);
            localDateToday=localDateToday.plusWeeks(1);
        } while (localDateToday.isBefore(dateTwoMonthsLate));
    }
}
