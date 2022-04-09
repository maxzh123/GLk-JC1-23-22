package by.itAcademy.homeworks.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Ввести с клавиатуры номер месяца текущего года. Вывести на экран все его
 * даты в формате d::MMM::uuuu.
 **/

public class Task64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        LocalDate ld = LocalDate.now();
        LocalDate ld2 = LocalDate.of(ld.getYear(), month, 1);
        do {
            System.out.println(ld2.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
            ld2 = ld2.plusDays(1);
        } while (ld2.getDayOfMonth() > 1);
    }
}
