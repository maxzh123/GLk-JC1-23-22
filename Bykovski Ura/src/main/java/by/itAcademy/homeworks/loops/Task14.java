package by.itAcademy.homeworks.loops;

import java.util.Scanner;

//Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
public class Task14 {
    public static void main(String[] args){
        long last_digit;
        long num=7893823445l;
        long sum=0;
        do {
            last_digit = num % 10;
            num /= 10;
            sum += last_digit;
        } while (num>0);
        System.out.println(sum);
    }
}
