package by.itAcademy.homeworks.collections;

//Ввести текст с клавиатуры.
// Для текста создать Map, где ключом будет слово, а значение – количество повторений этого слова в тексте.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String[] t=s.split(" ");
        Map<String, Integer> map=new HashMap<>();
        for (String word:t){
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word,1);
            }
        }
        System.out.println(map);
    }
}
