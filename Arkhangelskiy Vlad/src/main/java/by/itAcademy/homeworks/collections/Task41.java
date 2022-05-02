package by.itAcademy.homeworks.collections;

/**
 * Task 41
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * Найти самую высокую оценку с использованием итератора.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task41 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            numbers.add(random.nextInt(11));
        }

        System.out.println(getMax(numbers));

    }

    public static int getMax(ArrayList<Integer> numbers) {

        Iterator<Integer> iterator = numbers.iterator();
        int maxMark = iterator.next();
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element > maxMark) {
                maxMark = element;
            }
        }
        return maxMark;
    }
}