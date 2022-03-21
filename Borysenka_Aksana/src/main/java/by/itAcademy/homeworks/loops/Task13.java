package by.itAcademy.homeworks.loops;

import java.math.BigInteger;

public class Task13 {
    /**
     * Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
     * (тоже, что !25)
     */
    public static void main(String[] args) {
        int n = 1;
        int fact = 25;
        System.out.println(calcNuber(n, fact));
    }

    public static BigInteger calcNuber(int n, int fact){
        BigInteger rez = new BigInteger("1");
        do {
        rez = rez.multiply(BigInteger.valueOf(n));
        n++;
    } while (n <=fact);
        return rez;
    }
}
