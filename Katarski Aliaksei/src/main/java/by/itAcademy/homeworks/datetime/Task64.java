package by.itAcademy.homeworks.datetime;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * > Ввести с клавиатуры номер месяца текущего года. Вывести на экран все его
 * > даты в формате d::MMM::yyyy.
 */

public class Task64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int curMonth = sc.nextInt();
        getAllDaysFromMonth(curMonth);
    }

        public static LocalDate getAllDaysFromMonth(int currentMonth){
        LocalDate today=LocalDate.now();
        LocalDate allDays=LocalDate.of(today.getYear(),currentMonth,1);
        do{
            System.out.println(allDays.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
            allDays=allDays.plusDays(1);
        }while (allDays.getDayOfMonth()>1);
        return allDays;
    }

}