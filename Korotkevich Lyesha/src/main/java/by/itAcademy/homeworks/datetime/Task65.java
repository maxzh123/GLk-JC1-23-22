package by.itAcademy.homeworks.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**От текущей даты вывести расписание всех встреч, которые происходят еженедельно в 13:00 в течение 2 месяцев.*/

public class Task65 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime ldt = LocalDateTime.of(localDate, LocalTime.parse("13:00"));
        LocalDateTime ldt2 = ldt.plusMonths(2);
        while(ldt.isBefore(ldt2)){
            System.out.println(ldt.format(DateTimeFormatter.ofPattern("d:MMM:uuuu HH:mm")));
            ldt = ldt.plusWeeks(1);
        }
    }
}
