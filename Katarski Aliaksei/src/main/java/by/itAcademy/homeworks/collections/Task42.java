package by.itAcademy.homeworks.collections;

import java.util.*;

/**
 * Ввести текст с клавиатуры. Для текста создать Map, где ключом будет слово, а
 * > значение – количество повторений этого слова в тексте.
 */

public class Task42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstString=sc.nextLine();
        String[] splitStr=firstString.split(" ");
        Map<String,Integer> a=new HashMap<>();
        for(String b: Arrays.asList(splitStr)){
            a.put(b,Collections.frequency(Arrays.asList(splitStr),b));
        }
        System.out.println(a);
        }
    }


