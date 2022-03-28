package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task41 {

    /**TAsk41
     * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
     * Найти самую высокую оценку с использованием итератора.
     */

    public static void main(String[] args) {
        int numberOfStudents = 20;
        marks(numberOfStudents);
        System.out.println(getHighMarks(marks(numberOfStudents)));
    }

    public static List<Integer> marks(int number) {
        ArrayList<Integer> marks = new ArrayList<>(number);
        for (int i = 0; i < number; i++) {
            marks.add(i, (int) (Math.random() * 10 + 1));
        }
        return marks;
    }


    public static int getHighMarks(List<Integer> t){
        System.out.println(t);
        int highMark = t.get(0);
        for (int i: t
             ) {
            if(t.get(i) > highMark){
                highMark = t.get(i);
            }
        }
        return highMark;
    }

    //второй вариант
    
//    public static int getHighMarks(List<Integer> t){
//        Iterator<Integer> it = t.iterator();
//        int highMark = t.get(0);
//        while (it.hasNext()) {
//            it.next();
//            if(it.next() > highMark){
//                highMark = it.next();
//            }
//        }
//        return highMark;
//    }
}
