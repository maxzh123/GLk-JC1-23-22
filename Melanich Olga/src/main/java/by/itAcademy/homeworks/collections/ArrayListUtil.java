package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUtil {
    public static List fillArrayList(List<Integer> list, int number) {
        for (int i = 0; i < number; i++) {
            list.add((int) (Math.random() * 10 + 1));
        }
        return list;
    }
}
