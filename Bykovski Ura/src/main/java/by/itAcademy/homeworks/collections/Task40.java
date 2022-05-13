package by.itAcademy.homeworks.collections;

//Создать коллекцию, заполнить ее случайными целыми числами. Удалить повторяющиеся числа.

import java.util.ArrayList;
import java.util.List;

public class Task40 {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        for (int i=0;i<15;i++) {
            arrayList.add((int) (Math.random() * 20) + 1);
        }
        System.out.println(arrayList);
        int a;
        for (int i=0;i<arrayList.size();i++){
            a=arrayList.get(i);
            for (int j=i+1;j<arrayList.size();j++){
                if (arrayList.get(j)==a){
                    arrayList.remove(j);
                }
            }
        }
        System.out.println(arrayList);
    }
}
