package by.itAcademy.homeworks.operators;

import java.util.Scanner;

//Задать целое число в виде переменной, это число – сумма денег в рублях. Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 0) {
            System.out.println(a + " рублей");
        } else if (a == 1) {
            System.out.println(a + " рубль");
        } else if (a >= 2 & a <= 4) {
            System.out.println(a + " рубля");
        } else if (a >= 5) {
            System.out.println(a + " рублей");
        }
    }
}
