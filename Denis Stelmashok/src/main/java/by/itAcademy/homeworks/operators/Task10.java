package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enetr c: ");
        int c = sc.nextInt();
        System.out.println("Enetr d: ");
        int d = sc.nextInt();
        System.out.println("Enetr e: ");
        int e = sc.nextInt();
        System.out.println("Enter f: ");
        int f = sc.nextInt();
        int house1 = a * b;
        int house2 = c * d;
        int land = e * f;
        if (house1 + house2 > land) {
            System.out.println("Нельзя произвести застройку земельного участка");
        } else if (house1 + house2 <= land) {
            System.out.println("Можно произвести застройку земельного участка");

        }
    }
}