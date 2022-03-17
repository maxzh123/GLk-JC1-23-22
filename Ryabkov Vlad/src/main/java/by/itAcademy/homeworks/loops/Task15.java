package by.itAcademy.homeworks.loops;

/**
 * Найти среди числе от 50 до 70 второе простое число и завершить цикл
 */

public class Task15 {
    public static void main(String[] args) {
        System.out.println(search(50, 70));

    }
// функция для проверки, является ли число простым
    public static boolean isPrimeNumb(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }
    // функция для поиска второго простого числа
    public static int search(int value1, int value2) {
        int secondPrimeNumb = 0;
        int count = 0;
        for (int i = value1; i <= value2; i++) {
            if (isPrimeNumb(i)) {
                count++;
                {
                    if (count == 2) {
                        secondPrimeNumb = i;
                        break;
                    }

                }
            }
        }
        return secondPrimeNumb;
    }
}
