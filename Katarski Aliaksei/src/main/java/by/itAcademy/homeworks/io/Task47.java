package by.itAcademy.homeworks.io;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * > Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
 * > препинания и слов. Вывести результат на экран.
 */

public class Task47 {
    public static void main(String[] args) throws IOException {
     BufferedReader reader=new BufferedReader(new FileReader("Katarski Aliaksei/src/main/resources/ForTask47.txt"));
     String a;
     String b="";
     while((a = reader.readLine()) != null){
         b+=a;
     }
     getPunctuationMarksCount(b);
     getCountOfWords(b);
}

    public static int getPunctuationMarksCount(String string){
        int count=0;
        Pattern p=Pattern.compile("([.]{3}|\\.{1}|\\,)|([!?]{1,3})|[;:()]",Pattern.MULTILINE);
        Matcher m=p.matcher(string);
        while(m.find()){
            count++;
        }
        System.out.println("marks "+ count);
        return count;
    }
    public static int getCountOfWords(String string){
        int count=0;
        Pattern p=Pattern.compile("([a-zA-Zа-яА-ЯЁё]+[-]?[ ]{2,}[a-zA-Zа-яА-ЯЁё]+)|([a-zA-Zа-яА-ЯЁё]+[-]?[a-zA-Zа-яА-ЯЁё]+)");
        Matcher m= p.matcher(string);
        while (m.find()){
            count++;
        }
        System.out.println("words "+count);
        return count;
    }
}
