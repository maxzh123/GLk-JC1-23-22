package by.itAcademy.homeworks.datetime;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class Task64 {
    public static void main(String[] args) {
       DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MMMM-yyyy", Locale.CANADA_FRENCH);
       LocalDate date =LocalDate.now();
       System.out.println(date.format(df));
       ZonedDateTime dt=ZonedDateTime .now();
       System.out.println(dt);
       Duration d=Duration.ofDays(5);

       LocalDate nextSunday = date.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
       System.out.println(nextSunday);


    }
}
