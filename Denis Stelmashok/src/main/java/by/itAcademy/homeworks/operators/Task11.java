package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String week[] = new String[7];
        for (int i = 0; i < week.length; i++) {
            System.out.println("Enter plan for the day: " + (i + 1));
            week[i] = sc.nextLine();
        }
        System.out.println("Enter your day: ");
        Scanner day = new Scanner(System.in);
        int in = day.nextInt();
        copy(week, in);
    }

    public static void copy(String[] week, int in) {
        System.out.println("Your plan for the day: " +  " " + (in) + week[in-1]);

    }
    }
