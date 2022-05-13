package by.itAcademy.homeworks.collections;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
//Удалить неудовлетворительные оценки из списка.

import java.util.ArrayList;
import java.util.List;

public class Task39 {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        for (int i=0;i<15;i++){
            arrayList.add((int)(Math.random()*10)+1);
        }
        System.out.println(arrayList);
        arrayList.removeIf(i ->i<5);
        System.out.println(arrayList);
    }
}
