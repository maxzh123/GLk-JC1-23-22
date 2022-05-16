package by.itAcademy.homeworks.collections;

//Создать коллекцию, заполнить ее случайными целыми числами. Удалить повторяющиеся числа.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task40 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> arrayList2 = new ArrayList<>();
        int i;
        for (i = 0; i < 10; i++) {
            arrayList.add((int) (Math.random() * 20) + 1);
        }
        System.out.println(arrayList);
        int a;
        for (i=0;i<arrayList.size();i++){
            a=arrayList.get(i);
            if (arrayList2.indexOf(a)==-1){
                arrayList2.add(a);
            }
        }
        System.out.println(arrayList2);
    }
}
