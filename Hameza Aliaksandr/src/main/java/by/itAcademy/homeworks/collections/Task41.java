package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Задание 41
 * Создать список оценок учеников с помощью ArrayList,
 * заполнить случайными оценками. Найти самую высокую оценку с использованием итератора.
 */

public class Task41 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            marks.add((int) (Math.random() * 10) + 1);
        }
        System.out.println(marks);
        Iterator<Integer> iterator = marks.iterator();
        int max = marks.get(0);
        while (iterator.hasNext()) {
            int a = iterator.next();
            if (a > max) {
                max = a;
            }
        }
        System.out.println(max);
    }
}
