package by.itAcademy.homeworks.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Ввести с клавиатуры номер месяца текущего года. Вывести в формате d::MMM::uuuu.
 */

public class Task64 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
    }
}
