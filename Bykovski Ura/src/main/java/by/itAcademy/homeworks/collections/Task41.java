package by.itAcademy.homeworks.collections;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
//Найти самую высокую оценку с использованием итератора.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task41 {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        for (int i=0;i<15;i++) {
            arrayList.add((int) (Math.random() * 10) + 1);
        }
        System.out.println(arrayList);
        Iterator<Integer> iterator=arrayList.iterator();
        int max=arrayList.get(0);
        while (iterator.hasNext()){
            int a=iterator.next();
            if (a>max){
                max=a;
            }
        }
        System.out.println(max);
    }
}
