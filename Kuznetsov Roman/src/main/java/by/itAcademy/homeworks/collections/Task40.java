package by.itAcademy.homeworks.collections;

import java.util.*;

public class Task40 {
    public static void main(String[] args) {
        final int range =30;
        List<Integer> list = (List<Integer>) Task39.fillList(new ArrayList<>(),range,100);
        HashSet<Integer> hashSet = new HashSet(list);
        System.out.println(list);
        System.out.println(hashSet);
    }
}
