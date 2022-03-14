package by.itAcademy.homeworks.loops;

/**
 * Задание 15
 * Найти среди чисел от 50 до 70 второе простое число
 * (число называют простым, если оно делится без остатка только на 1 и себя) и завершить цикл с использованием break.
 */

public class Task15 {
    public static void main(String args[]) {
        int secondSimple = 0;
        int count = 0;
        for (int i = 50; i <= 70; i++) {
            if (isSimple(i)) {
                count++;
            }
            if (count == 2) {
                secondSimple = i;
                break;
            }
        }
        System.out.println("Второе простое число = " + secondSimple);
    }
    // метод для определения простого числа
    public static boolean isSimple ( int num){
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

