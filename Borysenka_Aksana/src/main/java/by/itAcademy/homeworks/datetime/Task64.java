package by.itAcademy.homeworks.datetime;

import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Task64 {

    /**Task64
     * Ввести с клавиатуры номер месяца текущего года. Вывести на экран все его даты в формате d::MMM::uuuu.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int monthNumber = sc.nextInt();
        getAllDateOfMonth(monthNumber);
    }

    public static LocalDate getAllDateOfMonth(int month){
        LocalDate ld = LocalDate.now();
        LocalDate ld2 = LocalDate.of(ld.getYear(), month, 1);
        do {
            System.out.println(ld2.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
            ld2 = ld2.plusDays(1);
        } while (ld2.getDayOfMonth() > 1);
        return ld2;
    }
}
