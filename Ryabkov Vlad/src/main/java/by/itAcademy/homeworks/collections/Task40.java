package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        Set<Integer> hash = new HashSet<>(list);
        System.out.println(hash);
    }
}
