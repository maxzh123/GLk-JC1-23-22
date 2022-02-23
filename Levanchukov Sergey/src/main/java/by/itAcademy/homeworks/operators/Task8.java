package by.itAcademy.homeworks.operators;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
> Задать целое число в виде переменной, это число – сумма денег в рублях.
> Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже
*/
public class Task8 {
    public static void main(String[] args) throws Exception {
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    int numb=Integer.parseInt(reader.readLine());
    rubP(numb);
    }

    static void rubP (int money) {
        if (money <= 20)
            if (money == 1) {
                System.out.println(money + " рубль");
            } else if (money == 2 || money == 3 || money == 4) {
                System.out.println(money + " рубля");
            } else System.out.println(money + " рублей");
        else if (money > 20) {
            if (money % 10 == 1) {
                System.out.println(money + " рубль");
            } else if (money % 10 == 2 || money % 10 == 3 || money % 10 == 4) {
                System.out.println(money + " рубля");
            } else System.out.println(money + " рублей");
        }

    }


}
