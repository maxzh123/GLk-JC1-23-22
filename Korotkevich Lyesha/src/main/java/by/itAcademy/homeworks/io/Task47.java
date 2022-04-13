package by.itAcademy.homeworks.io;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов. Вывести результат на экран.*/

public class Task47 {
    public static void main(String[] args) throws IOException {
        File file = new File("Korotkevich Lyesha/src/main/resources/Task47");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        StringBuilder text = new StringBuilder();
        String str = bufferedReader.readLine();
        while (str != null) {
            text.append(str);
            str = bufferedReader.readLine();
        }
        System.out.println("Количество знаков препинаний: "+ geCountPrep(text));
        System.out.println("Количество слов: " + geCountWords(text));
    }

    public static int geCountPrep(StringBuilder str){
        int count = 0;
        Pattern pattern = Pattern.compile("([!?]+|\\.{3}|[,;:\"'()\\.—]\\s?)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static int geCountWords(StringBuilder str){
        return str.toString().split("(\\s+|[!?]+|\\.{3}|[,;:\"'()\\.]\\s?)").length;
    }
}
