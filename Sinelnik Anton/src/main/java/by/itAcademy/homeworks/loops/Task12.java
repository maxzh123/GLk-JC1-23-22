package by.itAcademy.homeworks.loops;

/** Вычислить факториал целых чисел от 0 до 10 с помощью цикла while
 */

public class Task12 {
    public static void main(String[] args) {
        int x = 10;
        int i = 0;
        int f = 0;
        while (i <= x) {
            f = f * i;
            i++;
        }
        System.out.println("Число итераций " + i + "f = " + f);
    }
}

