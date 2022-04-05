package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


/**
 * Задание 40
 * Создать коллекцию, заполнить ее случайными целыми числами. Удалить повторяющиеся числа.
 */

public class Task40 {
    public static void main(String[] args) {
        final int number = 10;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayListUtil.fillArrayList(list, number);
        System.out.println(list);

        // способ, если важна последовательность элементов
        Set<Integer> linkedSet = new LinkedHashSet<>();
        for (Integer integer : list) {
            linkedSet.add(integer);
        }
        System.out.println(linkedSet);
    }
}
        // способ, если последовательность не важна
//        Set<Integer> hashSet = new HashSet<>(list);
//        System.out.println(hashSet);
