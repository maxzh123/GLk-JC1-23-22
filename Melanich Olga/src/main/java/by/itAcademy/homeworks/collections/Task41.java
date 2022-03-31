package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Задание 41
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * Найти самую высокую оценку с использованием итератора.
 */

public class Task41 {
    public static void main(String[] args) {
        final int studentMarks = 10;
        List<Integer> list = new ArrayList<>();
        System.out.println(ArrayListUtil.fillArrayList(list, studentMarks));

        int maxMark = list.get(0);
        for (Iterator<Integer> iter = list.iterator(); iter.hasNext(); ) {
            int i = iter.next();
            if (i > maxMark) {
                maxMark = i;
            }
        }
        System.out.println(maxMark);
    }
}
//        Iterator<Integer> iter = list.iterator();
//        int maxMark = list.get(0);
//        while (iter.hasNext()) {
//            int i = iter.next();
//            if (i > maxMark) {
//                maxMark = i;
//            }
//        }
//        System.out.println(maxMark);






