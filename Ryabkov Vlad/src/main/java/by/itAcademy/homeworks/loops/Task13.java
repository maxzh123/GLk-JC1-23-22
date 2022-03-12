package by.itAcademy.homeworks.loops;

import java.math.BigInteger;

/**
 * ## Задание 13
 * > Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
 */

public class Task13 {
    public static void main(String[] args) {
        System.out.println(multipler(1,25));
    }

    public static BigInteger multipler (int value1, int value2){
        BigInteger product = new BigInteger("1");
        int i = value1;
            do {
                product =product.multiply(BigInteger.valueOf(i));
            i++;
        } while (i <= value2);
            return product;
    }
}
