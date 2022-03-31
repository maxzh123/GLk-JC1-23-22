package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Задание 39
 *
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * Удалить неудовлетворительные оценки из списка.
 */

public class Task39 {
    public static void main(String[] args) {
        final int studentMarks = 30;
        List<Integer> list = new ArrayList<>();
        System.out.println(ArrayListUtil.fillArrayList(list, studentMarks));

        // десятибальная система, неуд - 1,2,3
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next() <= 3) {
                iter.remove();
            }
        }
        System.out.println(list);
    }
}
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) <= 3) {
//                list.remove(i);
//                i--;
//            }
//        }
//        System.out.println(list);

