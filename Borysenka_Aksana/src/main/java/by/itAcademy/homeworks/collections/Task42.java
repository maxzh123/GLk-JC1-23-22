package by.itAcademy.homeworks.collections;

import java.util.*;
import by.itAcademy.homeworks.helper.strScanner;

public class Task42 {

    /**Task42
     * Ввести текст с клавиатуры.
     * Для текста создать Map, где ключом будет слово, а значение – количество повторений этого слова в тексте.
     */

    public static void main(String[] args) {
        strScanner str = new strScanner();

        System.out.println(getResult(getList(str.strEnter())));
    }

    public static List<String > getList(String x) {
        List<String> lst = new ArrayList<>();
        lst = Arrays.asList(x.split(" "));
        return lst;
    }


    public static Map<String, Integer> getResult(List<String> t) {
        Map<String, Integer> rez = new HashMap<>();
        for (String i : t
        ) {
            rez.put(i, Collections.frequency(t, i));
        }
        return rez;
    }

}
