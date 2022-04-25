package by.itAcademy.homeworks.datetime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Task65 {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now(); //установка начала периода
        LocalDateTime ending = start.plus(Period.ofMonths(2)); //установка конца периода
        while (start.isBefore(ending)) //Цикл для вывода дат встреч
        {
            System.out.println(start.format(DateTimeFormatter.ofPattern("dd.MM.yyyy ")) + "13:00 встреча"); //выводим даты ряльна
            start = start.plus(Period.ofWeeks(1)); //Добавляем одну неделю
        }
    }

}
