package by.itAcademy.homeworks.regexp;
import by.itAcademy.homeworks.helper.strScanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {

    /**Task30
     * Введите с клавиатуры строку.
     * Напишите метод, выполняющий поиск в строке всех тегов абзацев, в том числе тех, у которых есть параметры,
     * например, <p id=”p1”>, и замену их на простые теги абзацев <p>. Результат работы метода выведите на экран.
     */
//(<\/p>)|(<p>)|(<p\s+[A-Za-z]+\s*=\s*"[A-Za-z]+">)

    public static void main(String[] args) {
        strScanner strObject = new strScanner();
        String str = strObject.strEnter();
        System.out.println("Your line:\n" + str);
        System.out.println("Your edited line:\n" + editedStr(str));
    }

    public static String editedStr(String str){
        Pattern p = Pattern.compile("(<\\/p>)|(<p>)|(<p\\s+[A-Za-z]+\\s*=\\s*\"[A-Za-z]+\">)");
        Matcher m = p.matcher(str);
        while(m.find()){
            str = m.replaceAll("<p>");
            }
        return str;
    }

}
