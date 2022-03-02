package by.itAcademy.homeworks.loops;
import java.math.*;

/** Вычислить произведение чисел от 1 до 25 с помощью цикла do while. */

public class Task13 {
        public static void main(String[] args){
            System.out.println(pr());
        }
        public static BigInteger pr(){
            BigInteger num = BigInteger.valueOf(1);
            BigInteger i = BigInteger.valueOf(0);
            do {
                i = i.add(BigInteger.valueOf(1));
                num = num.multiply(i);
            }while (i.compareTo(BigInteger.valueOf(25)) == -1);
            return num;
        }
}
