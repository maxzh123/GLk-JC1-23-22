package by.itAcademy.homeworks.loops;

import java.math.BigInteger;

//Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
public class Task13 {
    public static void main(String[] args){
        int i=1;
        double pr=1;
        while (i<=25){
            pr*=i;
            i++;
        }
        System.out.println("Произведение равняется "+pr);
    }
}
