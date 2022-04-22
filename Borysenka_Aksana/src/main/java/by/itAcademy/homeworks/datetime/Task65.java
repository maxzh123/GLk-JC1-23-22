package by.itAcademy.homeworks.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAdjuster;

public class Task65 {

    /**Task65
     * От текущей даты вывести расписание всех встреч, которые происходят еженедельно в 13:00 в течение 2 месяцев.
     */

    public static void main(String[] args) {
        String meeting = "Work";

        LocalTime t = LocalTime.now();
        LocalTime ltExpected = LocalTime.of(13,00,00,00);
        LocalDate ld = LocalDate.now();
        LocalDate ldExpected = ld.plusMonths(2);

        if (t.compareTo(ltExpected) == 1){
            ld = ld.plusDays(1);
            ldExpected = ldExpected.plusDays(1);
        }

        do{
            System.out.println(ld.toString() + " " +  ltExpected.toString() + " " + meeting);
            ld = ld.plusDays(1);
        } while (ld.isBefore(ldExpected));
    }
}
