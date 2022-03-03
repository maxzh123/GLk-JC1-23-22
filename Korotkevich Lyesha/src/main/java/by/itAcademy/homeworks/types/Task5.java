package by.itAcademy.homeworks.types;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int m;
        int weeks;
        int days;
        int hours;
        int min;
        int sec;
        weeks = time /604800;
        m = time % 604800;
        days = m / 86400;
        m %= 86400;
        hours = m / 3600;
        m %= 3600;
        min = m / 60;
        sec =m % 60;
        System.out.println(weeks+" weeks "+days+" days "+ hours+" hours "+min+" minutes "+sec+" sec");
    }
}
