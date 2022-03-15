package by.itAcademy.homeworks.objects.task24;

import by.itAcademy.homeworks.objects.task24.TimeInterval;
import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        int seconds, minutes,hours;
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter seconds, minutes and hours for first object:");
        seconds=sc.nextInt();
        minutes=sc.nextInt();
        hours=sc.nextInt();
        TimeInterval time1=new TimeInterval(seconds,minutes,hours);
        System.out.println("Enter seconds, minutes and hours for second object:");
        seconds=sc.nextInt();
        minutes=sc.nextInt();
        hours=sc.nextInt();
        TimeInterval time2=new TimeInterval(seconds,minutes,hours);
        printResult(time1,time2);
    }

    public static void printResult(TimeInterval time1,TimeInterval time2){
        System.out.println(time1.getSeconds());
        System.out.println(time2.getSeconds());
        System.out.println(time1.compareTo(time2));
    }
}
