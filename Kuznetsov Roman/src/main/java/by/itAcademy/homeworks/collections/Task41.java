package by.itAcademy.homeworks.collections;

import java.util.*;

public class Task41 {
    public static void main(String[] args) {
        final int StudentsNumber = 30;
        List<Integer> marks = (List<Integer>) Task39.fillList(new ArrayList(),StudentsNumber,10);
        System.out.println(marks);
        Iterator<Integer> it = marks.listIterator();
        int max = marks.get(0);
        while(it.hasNext()){
            if(it.next()>max)
                max = it.next();
        }
        System.out.println("Max value:"+max);
    }
}
