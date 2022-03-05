package by.itAcademy.homeworks.loops;

public class MathEquation {
    /**
     * Нахождение простых чисел от 2 до 2147483647
     */
    public static int primeNumber(int nuumber, int number2) {
        while (nuumber < number2) {
            int r = 2;
            boolean im = true;
            while (r < nuumber) {
                if (nuumber % r == 0) {
                    im = false;
                    break;
                }
                r++;
            }
            if (im) {
                System.out.println(nuumber);
            }
            nuumber++;
        }
        return nuumber;
    }


    /**
     * Заполнение масива числами
     */
    public static int s = 0;

    public static int[] intas(int[] suma) {
        while (s < suma.length) {
            suma[s] = s;
            //       System.out.println(suma[s]);
            s++;
        }
        return suma;
    }

    /**
     * факториал числа произведение чисел
     */
    public static int sum1 = 1;

    public static int factorial(int sum) {
        while (sum == sum1) {
            return sum1;
        }
        return sum * factorial(sum - sum1);
    }
}
