package by.itAcademy.homeworks.operators;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату следующего дня.
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.add(Calendar.DAY_OF_MONTH, +1);
        System.out.println(calendar.getTime());

    }
}
