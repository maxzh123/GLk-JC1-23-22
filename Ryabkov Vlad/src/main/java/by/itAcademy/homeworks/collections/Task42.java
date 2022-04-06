package by.itAcademy.homeworks.collections;
/**
 * Ввести текст с клавиатуры. Для текста создать Map, где ключом будет слово, а
 * значение – количество повторений этого слова в тексте.
 */

import java.util.*;

public class Task42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] str = s.split(" ");
        List<String> list = new ArrayList<>();
        list = Arrays.asList(str);

        Map<String, Integer> map = new HashMap<>();
        for (String words : list){
            map.put(words, Collections.frequency(list,words));
        }
        System.out.println(map);
    }
}
