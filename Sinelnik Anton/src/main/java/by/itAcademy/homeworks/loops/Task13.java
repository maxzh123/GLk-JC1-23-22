package by.itAcademy.homeworks.loops;

/** Вычислить произведение чисел от 1 до 25 с помощью цикла do while
 */

public class Task13 {
    public static void main(String[] args) {
        int x = 25;
        int i = 1;
        int f = 1;
        do {
            f = f * i;
            i++;
        } while (i <= x);
            System.out.println("Число итераций " + i + ", f = " + f);
        }
    }

