package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length: ");
        int a = in.nextInt();
        System.out.println("Enter width: ");
        int b = in.nextInt();
        System.out.println("Enter circle: ");
        int r = in.nextInt();
        if (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) <= 2*r) {
        System.out.println("Можно полностью закрыть");
        } else{
        System.out.println("Нельзя");
    }
}
}
