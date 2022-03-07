package by.itAcademy.homeworks.operators;

import java.util.Scanner;

/**
 * ## Задание 6
 * > Создайте метод с одним целочисленным параметром. Метод должен
 * > определить, является ли последняя цифра числа семеркой и вернуть boolean
 * > значение.
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите число : ");
        int value = sc.nextInt();
        boolean check = checkValue(value);
        System.out.println(check);

    }

    public static boolean checkValue(int value) {
        int check = value % 10;
        if (check == 7) {
            return true;
        } else return false;
    }
}
