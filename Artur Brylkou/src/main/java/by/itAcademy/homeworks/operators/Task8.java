package by.itAcademy.homeworks.operators;


import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Количество рублей:");
        int sumRub = sc.nextInt();
        System.out.println(rubCorrectCase(sumRub));
    }
    public static String rubCorrectCase(int a){
        String str1 = "рубль";
        String str2 = "рубля";
        String str3 = "рублей";
        if (a % 10 == 1 && a % 100 != 11) {
            return str1;
        }
        if (a % 10 == 2 || a % 10 == 3 || a % 10 == 4) {
            return str2;
        }
        return str3;
    }

}
