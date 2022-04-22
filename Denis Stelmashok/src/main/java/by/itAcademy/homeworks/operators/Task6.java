package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Input a number: ");
        int numer = num.nextInt();
        System.out.println(checkLastNumber(numer));
    }

    public static boolean checkLastNumber(int z) {
        if (z % 10 == 7) {
            return true;
        } else {
            return false;
        }
    }
}