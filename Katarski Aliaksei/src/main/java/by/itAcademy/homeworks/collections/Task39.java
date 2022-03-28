package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Заполнить ArrayList случайными оценками.Удалить плохие.
 *
 */
public class Task39 {
    public static void main(String[] args) {
        ArrayList<Integer> schoolMarks = new ArrayList<>();
        System.out.println(school(schoolMarks));
        System.out.println(badMarksGoOut(schoolMarks));
    }

    public static ArrayList<Integer> school(ArrayList<Integer> emptyList) {
        for (int i = 0; i < 10; i++) {
            emptyList.add(i, (int) (Math.random() * 10));
        }
        return emptyList;
    }

    public static ArrayList<Integer> badMarksGoOut(ArrayList<Integer> listWBadMarks) {
        Iterator<Integer> marksIterator = listWBadMarks.iterator();
        while (marksIterator.hasNext()) {
            if (marksIterator.next() <= 4) {
                marksIterator.remove();
            }
        }
        return listWBadMarks;
    }
}


