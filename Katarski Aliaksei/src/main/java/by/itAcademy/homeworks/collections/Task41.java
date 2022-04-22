package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *  Создать список оценок учеников с помощью ArrayList, заполнить случайными
 * > оценками. Найти самую высокую оценку с использованием итератора.
 */
public class Task41 {
    public static void main(String[] args) {
        ArrayList<Integer> schoolMarks=new ArrayList<>();
        System.out.println(Task39.school(schoolMarks));
        System.out.println(maxMark(schoolMarks));
    }
    public static int maxMark(ArrayList<Integer> marks){
        int mark=marks.get(0);
        Iterator<Integer> marksIterator=marks.iterator();
        while (marksIterator.hasNext()){
            if(mark<marksIterator.next()){
                mark= marksIterator.next();
            }
        }
        return mark;
    }
}
