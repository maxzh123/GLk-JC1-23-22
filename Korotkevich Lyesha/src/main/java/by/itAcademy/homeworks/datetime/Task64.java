package by.itAcademy.homeworks.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

/**Ввести с клавиатуры номер месяца текущего года. Вывести на экран все его даты в формате d::MMM::uuuu.*/

public class Task64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("d::MMM::uuuu");
        int monthNumber = sc.nextInt();
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(localDate.getYear(), monthNumber, 1);
        while(localDate1.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth() > (localDate1.getDayOfMonth())){
            System.out.println(df.format(localDate1));
            localDate1 = localDate1.plusDays(1);
        }
        System.out.println(df.format(localDate1));
    }
}
