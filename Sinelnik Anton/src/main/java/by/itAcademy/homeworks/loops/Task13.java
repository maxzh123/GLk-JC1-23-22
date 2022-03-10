package by.itAcademy.homeworks.loops;

/** Вычислить произведение чисел от 1 до 25 с помощью цикла do while
 */

public class Task13 {
    public static void main(String[] args) {
        double x = 25;
        double i = 1;
        double f = 1;
        do {
            f = f * i;
            i++;
        } while (i <= x);
            System.out.println("Число итераций " + i + ", f = " + f);
        }
    }

