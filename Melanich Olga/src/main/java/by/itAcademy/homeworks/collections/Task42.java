package by.itAcademy.homeworks.collections;


import java.util.*;

/**
 * Задание 42
 *  * Ввести текст с клавиатуры. Для текста создать Map, где ключом будет слово,
 * а значение – количество повторений этого слова в тексте.
 */

public class Task42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] str = s.split(" ");
        List<String> listWords = new ArrayList<>();
        listWords = Arrays.asList(str);

        Map<String, Integer> map = new HashMap<>();
        for (String word : listWords) {
            map.put(word, Collections.frequency(listWords, word));
        }
        System.out.println(map);
    }
}



