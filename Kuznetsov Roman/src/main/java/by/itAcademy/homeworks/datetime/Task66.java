package by.itAcademy.homeworks.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task66 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now().minusDays(60).format(DateTimeFormatter.ofPattern("dd.MM.yyyy "))); //хз, в чем суть задания
    }
}
