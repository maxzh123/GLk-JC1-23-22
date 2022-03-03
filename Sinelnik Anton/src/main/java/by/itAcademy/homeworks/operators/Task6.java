package by.itAcademy.homeworks.operators;

import java.util.Random;

/** Создайте метод с одним целочисленным параметром.
 * Метод должен определить, является ли последняя цифра числа семеркой и вернуть boolean значение.
 */

public class Task6 {
    public static void main(String[] args) {
        int count = (int) (Math.random() * 100);
        sevencheck(count);
    }

    private static void sevencheck(int count) {
        if (count % 10==7)
            System.out.println("последняя цифра числа "+count+ " является семеркой");
        else
            System.out.println("последняя цифра числа "+count+ " не является семеркой");
    }
}
