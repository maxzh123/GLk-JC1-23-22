/*Создайте метод с одним целочисленным параметром.
 Метод должен определить, является ли последняя цифра числа семеркой и вернуть boolean значение.*/

package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task6 {
    public static boolean boolSeven(int x){
        return x%10 == 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        System.out.println(boolSeven(a));
    }
}
