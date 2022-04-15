package by.itAcademy.homeworks.io;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
 * >препинания и слов. Вывести результат на экран.
 */

// Words "[А-Яа-яЁёA-Za-z]+(?:[-][А-Яа-яЁёA-Za-z]+)*"
//punct "[\\.]{3}|[\\?|\\!][\\!\\?\\.]*|[\\.,!?:;\\-\"()]"


public class Task47 {
    public static void main(String[] args) throws IOException {
        String str = " ";
        BufferedReader br = new BufferedReader(new FileReader("D:\\task47.txt"));
        if (br.equals(null)) {
            System.out.println("Invalid input");
        } else {
            String strBr;
            while ((strBr = br.readLine()) != null) {
                str += strBr;
            }
            System.out.println("Колличество слов: " + getCountWords(str));
            System.out.println("Колличество знаков пунктуации: " + getCountPunct(str));
        }
    }

    public static int getCountWords (String str){
        Pattern pattern = Pattern.compile("\\s|[!?]+|[,.-;:]|(\\.{3})", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()){
            count++;
        }return count;
    }

    public static int getCountPunct (String str){
        Pattern pattern = Pattern.compile("\\?[?!.]*|\\![!?.]*|[.,:-]");
        Matcher matcher = pattern.matcher(str);
        int value = 0;
        while (matcher.find()){
            value++;
        }
        return value;
    }
}