package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Задание 39
 * Создать список оценок учеников с помощью ArrayList,
 * заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.
 */

public class Task39 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        for (int i= 0; i < 100; i++) {
            marks.add((int)(Math.random()*10)+1);
        }
        List<Integer> bad_marks = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            bad_marks.add(i);
        }
        marks.removeAll(bad_marks);
        System.out.println(marks.toString());
    }
}
