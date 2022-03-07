package by.itAcademy.homeworks.operators;

/** Task 9
 * Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату следующего дня.
 */

import java.util.Scanner;

public class Task9 {
    public static void main (String[] arg) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day of the month: ");
        int  dayNumber= in.nextInt();
        System.out.println("Enter the month number: ");
        int  monthNumber= in.nextInt();
        System.out.println("Enter the the year: ");
        int  yearNumber= in.nextInt();
        System.out.println("Date of the current day: " + dayNumber + "/" + monthNumber + "/" + yearNumber);
        if (checkEnterDate(dayNumber, monthNumber,yearNumber)){
        System.out.println("Error: enter correct date");
        } else {
            System.out.println("Date of the next day: " + nextDayData(dayNumber, monthNumber, yearNumber));
        }
    }

    public static boolean checkEnterDate(int day, int month, int year){
            return ((month > 12) || (day > 31) || ((day > 28) && (month == 2)) || ((day == 29) && !isLeapYear(year)));
    }

    public static boolean isLeapYear(int year) {
                return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }


    public static String nextDayData (int day, int month, int year){
        if ((day == 28) && (month == 2) && isLeapYear(year)) {
            day = 1;
            month++;
        } else if ((day == 28) && (month == 2) && !isLeapYear(year)) {
            day++;
        } else if (day == 29 && month == 2) {
            day = 1;
            month++;
        } else if ((day == 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
            day = 1;
            month++;
        } else if ((day == 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
            day = 1;
            month++;
        } else if ((day == 31) && month == 12) {
            day = 1;
            month = 1;
            year++;
        } else {
            day++;
        }
        return day + "/" + month + "/" + year;
    }

}
