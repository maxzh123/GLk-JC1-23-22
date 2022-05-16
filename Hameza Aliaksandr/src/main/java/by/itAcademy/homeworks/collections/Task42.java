package by.itAcademy.homeworks.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
        String[] text = str.split(" ");
        Map<String, Integer> textCount = new HashMap<>();
        for (String word : text) {
            if (textCount.containsKey(word)) {
                textCount.put(word, textCount.get(word) + 1);
            } else {
                textCount.put(word, 1);
            }
        }
        System.out.println(textCount);
    }
}
