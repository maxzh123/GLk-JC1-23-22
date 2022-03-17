package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task6 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВедите число ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println(check(a));
    }
    public static boolean check (int a) {
        return a % 10 == 7;
        }
    }
