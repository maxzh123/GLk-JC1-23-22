package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Создать коллекцию, заполнить ее случайными целыми числами. Удалить
 * > повторяющиеся числа.
 */
public class Task40 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList(Arrays.asList(1,4,5,6,2,1,6,6,2,1));
        HashSet<Integer> noneRepeatVal=new HashSet<>(arrayList);
        System.out.println(noneRepeatVal);
    }
}
