package by.itAcademy.homeworks.operators;

/**
 * Задать целое число в виде переменной, это число – сумма денег в рублях.
* Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сумму");
        int money = Integer.parseInt(reader.readLine());

         moneyCases(money);
    }
    public static void moneyCases(int a){
        if (a % 10 == 1 && a % 100 != 11){
            System.out.println(a + " рубль");
        }else if (a % 10 == 2 || a % 10 == 3 || a % 10 == 4){
            System.out.println(a + " рубля");
        }else
         System.out.println(a + " рублей");




    }
}
