package by.itAcademy.homeworks.operators;

import java.util.Scanner;

//Задать целое число в виде переменной, это число – сумма денег в рублях. Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>=10 & a<=20){
            System.out.println(a + " рублей");
        }
        else if (a%10 == 0) {
                 System.out.println(a + " рублей");
             } else if (a%10 == 1) {
                 System.out.println(a + " рубль");
             } else if (a%10>=2 & a%10<=4) {
                 System.out.println(a + " рубля");
             } else if (a%10>=5 & a%10<=9) {
                 System.out.println(a + " рублей");
        }
    }
}
