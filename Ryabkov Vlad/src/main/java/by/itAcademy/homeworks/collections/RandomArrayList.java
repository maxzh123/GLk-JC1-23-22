package by.itAcademy.homeworks.collections;

import java.util.List;

public class RandomArrayList {
    public static void fillArrayList(List<Integer> list, int number) {
        for (int i = 0; i < number; i++) {
            list.add((int) (Math.random() * 10 + 1));
        }
    }
}
