package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task7 {
    public static boolean isClsdByCircle(int a, int b, int r){
    return Math.max(a,b)<r;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isClsdByCircle(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));
    }
}
