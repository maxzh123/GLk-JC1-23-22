package by.itAcademy.homeworks.collections;

import java.util.*;

/**
 * Создать коллекцию, заполнить ее случайными целыми числами. Удалить
 *  повторяющиеся числа.
 */
public class Task40 {
    public static void main(String[] args) {
        int value = 20;
        List<Integer> list = new ArrayList<>();
        RandomArrayList.fillArrayList(list,value);
        System.out.println(list);
        Set<Integer> hash = new LinkedHashSet<>(list);
        System.out.println(hash);
    }
}
