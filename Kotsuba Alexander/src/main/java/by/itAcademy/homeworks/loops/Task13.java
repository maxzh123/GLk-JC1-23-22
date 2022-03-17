/*Вычислить произведение чисел от 1 до 25 с помощью цикла do while.*/

package by.itAcademy.homeworks.loops;

import java.math.BigDecimal;


public class Task13 {
    public static void main(String[] args) {
        int i = 1;
        int last = 25;
        System.out.println(resultOfCalc(i,last));


    }
    public static BigDecimal resultOfCalc(int i, int last){
        BigDecimal c = new BigDecimal("1");
        do {
            c = c.multiply(BigDecimal.valueOf(i));
            i++;
        }while(i<=last);
            return c;
        }
    }

