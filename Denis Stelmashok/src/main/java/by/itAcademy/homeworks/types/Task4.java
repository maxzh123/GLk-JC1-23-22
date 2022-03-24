package by.itAcademy.homeworks.types;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second, result;
        System.out.println("Enter first num: ");
        first = num.nextInt();
        System.out.println("Enter second num: ");
        second = num.nextInt();
        result = (first + second) + (first * second);
        System.out.println("Result is -" + result);
    }
}
