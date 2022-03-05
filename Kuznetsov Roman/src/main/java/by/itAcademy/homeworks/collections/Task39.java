package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task39 {
    public static List<?> fillList(List temp,int range,int maxvalue){
        Random rand = new Random();
        for (int i = 0; i < range; i++) {
            temp.add(rand.nextInt(maxvalue));
        }
        return temp;
    }
    public static void main(String[] args) {
        final int StudentsNumber = 30;
        List<Integer> marks = (List<Integer>) fillList(new ArrayList(),StudentsNumber,10);
        System.out.println("Source arrayList");
        System.out.println(marks);
        System.out.println("Edited arrayList");
        marks.removeIf(n -> (n < 4));
        System.out.println(marks);
    }
}
