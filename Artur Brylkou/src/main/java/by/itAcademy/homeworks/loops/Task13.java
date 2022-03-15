package by.itAcademy.homeworks.loops;

import java.math.BigInteger;

public class Task13 {
    public static void main(String[] args) {
        int fact = 25;
        int i = 1;
        System.out.println(calcNumber( i,fact));
    }
    public static BigInteger calcNumber(int i, int fact) {
        BigInteger rez = new BigInteger("1");
        do {
            rez = rez.multiply(BigInteger.valueOf(i));
            i++;
        } while (i <= fact);
        return rez;
    }
}
