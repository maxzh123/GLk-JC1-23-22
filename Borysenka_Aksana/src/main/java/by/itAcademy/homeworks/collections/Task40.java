package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task40 {

    /**Task40
     * Создать коллекцию, заполнить ее случайными целыми числами. Удалить повторяющиеся числа.
     */

    public static void main(String[] args) {
        int size = 20;

        System.out.println(getList(size));
        System.out.println(getNewList(getList(size)));
    }


    public static List getList(int n){
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++){
            lst.add(i, (int)(Math.random()*10));
        }
        return lst;
    }

    public static List getNewList(List<Integer> x){
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {
            if (!newList.contains(x.get(i))){
            newList.add(x.get(i));
            }
        }
        return newList;
    }

//второй способ
//        List<Integer> lst = new ArrayList<>();
//        for (int i = 0; i < size; i++){
//            lst.add(i, (int)(Math.random()*10));
//        }
//        System.out.println(lst);
//
//        HashSet set = new HashSet(lst);
//        lst.clear();
//        lst.addAll(set);
//        System.out.println(lst);
//
//    }
    
}
