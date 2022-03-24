package by.itAcademy.homeworks.loops;

/**
 * Найти среди чисел от 50 до 70 второе простое число
 * (число называют простым, если оно делится без остатка только на 1 и себя)
 * и завершить цикл с использованием break.
 */

public class Task15 {
    public static void main(String[] args) {
        System.out.println(secondSimple(50, 70));
    }


    public static boolean isSimple(int value) {
        boolean result = true;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static int secondSimple(int start, int end) {
        int secondSimple = 0;
        int count = 0;
        for (int i = start; i < end; i++) {
            if (isSimple(i)) {
                count++;
                {
                    if (count == 2) {
                        secondSimple = i;
                        break;
                    }

                }

            }
        }
        return secondSimple;
    }
}