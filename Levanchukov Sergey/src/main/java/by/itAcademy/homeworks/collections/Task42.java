package by.itAcademy.homeworks.collections;

import java.util.*;

/**
 * > Ввести текст с клавиатуры. Для текста создать Map, где ключом будет слово, а
 * > значение – количество повторений этого слова в тексте.
 **/

public class Task42 {
    public static void main(String[] args) {

        System.out.println(getWords(text()));

    }

    //метод получает коллекцию arraylist(в которой находится колекция слов и записывает ее в HashMap)
    public static Map<String,Integer> getWords (ArrayList<String> text){
        Map<String,Integer> map=new HashMap<>();
        for (String t:text) {
            map.put(t,Collections.frequency(text,t)); //Метод frequency() подсчитывает, сколько раз в коллекции коллекции встречается элемент
        }
        return map;
    }

    //метод приобразует введенный текст в ArrayList при помощи цикла и метода split
    public static ArrayList<String> text(){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> textColl=new ArrayList<>();
        String[] text= (sc.nextLine().split(" "));
        for (int i=0;i<text.length;i++){
            textColl.add(text[i]);
        }
        System.out.println(textColl);
        return textColl;
    }

}
