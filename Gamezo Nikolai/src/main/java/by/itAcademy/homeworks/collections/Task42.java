package by.itAcademy.homeworks.collections;

import java.util.*;

/**
 * Задание 42
 * Ввести текст с клавиатуры. Для текста создать Map, где ключом будет слово,
 * а значение – количество повторений этого слова в тексте.
 */

public class Task42 {
    public static void main(String[] args) {
        System.out.print("Введите текст: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Map: " + getMapFromList(getList(str)));
    }
    //преобразование строки в ArrayList
    public static List<String> getList(String str) {
        List<String> list = new ArrayList<>();
        list = Arrays.asList(str.split(" "));
        return list;
    }
    //преобразование ArrayList в HashMap
    public static Map<String, Integer> getMapFromList(List<String> arrayList) {
        Map<String, Integer> map = new HashMap<>();
        for(String word : arrayList) {
            if(map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }
            else {
                map.put(word, 1);
            }
        }
        return map;
    }
}
