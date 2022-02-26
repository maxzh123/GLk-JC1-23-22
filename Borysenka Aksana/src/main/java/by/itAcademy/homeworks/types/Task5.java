package by.itAcademy.homeworks.types;

// Ввод данных с консоли
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //выводим приглашение к вводу
        System.out.println("Input a number: ");

        // считываем введенное число int
        int s = in.nextInt();

        int sec;
        int m;
        int min;
        int h;
        int hours;
        int d;
        int days;
        int weeks;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hours = h % 60;
        d = h / 24;
        days = d % 24;
        weeks = days / 7;

        // выводим результат
        System.out.println(weeks + " недель" + "\n"+ h+" часов" + "\n"+  min + " минут" + "\n" + sec + " секунд");

        in.close();

    }
}
