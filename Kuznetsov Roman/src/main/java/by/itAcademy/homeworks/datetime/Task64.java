package by.itAcademy.homeworks.datetime;

import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Scanner;

public class Task64 {
    public static void main(String[] args) {
        try {
            LocalDate localDate = LocalDate.of(2022, new Scanner(System.in).nextInt(), 1); //Выход не элегантный, но и код я пишу не в 2 часа дня.
            for (int i = localDate.getDayOfMonth(); i <= (localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth()); i++) {
                System.out.println(localDate.format(DateTimeFormatter.ofPattern("d::MMM::yyyy")));
                localDate = localDate.plusDays(1);
            }
        }
        catch (DateTimeException e){
            System.out.println("В году всего 12 месяцев, от 1 до 12. Попробуй еще раз.");
        }
    }
}
