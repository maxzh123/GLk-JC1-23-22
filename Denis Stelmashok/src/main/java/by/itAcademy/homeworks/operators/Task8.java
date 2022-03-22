package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cash: ");
        int sum = sc.nextInt();
        if (sum % 10 == 1 && sum != 11) {
            System.out.println(sum + " рубль");
        } else if (sum % 10 == 2 || sum % 10 == 3 || sum % 10 == 4) {
        System.out.println(sum + " рубля");
        } else {
            System.out.println(sum + " рублей");
        }
    }
}
