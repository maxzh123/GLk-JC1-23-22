package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Задание 40
 * Создать коллекцию, заполнить ее случайными целыми числами. Удалить повторяющиеся числа.
 */

public class Task40 {
    public static void main(String[] args) {
        List<Integer> collection = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            collection.add((int) (Math.random() * 100) + 1);
            System.out.println(collection);
        }
            Set<Integer> collection2 = new LinkedHashSet<>();
            collection2.addAll(collection);
            collection.clear();
            for (Integer i : collection2) {
                collection.add(i);
            }
            collection2.clear();
            System.out.println(collection);

        }
    }
