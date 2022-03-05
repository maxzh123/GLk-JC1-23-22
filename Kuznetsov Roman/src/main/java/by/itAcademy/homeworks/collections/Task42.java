package by.itAcademy.homeworks.collections;

import java.util.*;

public class Task42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> map = getMapFromList(Arrays.asList(scanner.nextLine().split(" ")));
        System.out.println(map);
    }
    public static Map<String,Integer> getMapFromList(List<String> arrayList){
        Map<String,Integer> map = new LinkedHashMap<>();
        for (String s : arrayList) {
            map.put(s, Collections.frequency(arrayList, s));
        }
        return map;
    }
}
