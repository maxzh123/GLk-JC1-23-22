package by.itAcademy.homeworks.regexp;
import by.itAcademy.homeworks.helper.strScanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {

    /**Task29
     * Введите с клавиатуры строку.
     * Напишите метод, выполняющий поиск в строке шестнадцатеричных чисел, записанных по правилам Java, с помощью регулярных выражений.
     * Результат работы метода выведите на экран.
     */


    public static void main(String[] args) {
        strScanner strObject = new strScanner();
        String str = strObject.strEnter();
        System.out.println(getResult(str));
    }

    public static String getResult( String str){
        String str16 = "";
        Pattern p = Pattern.compile("0x([0-9A-Fa-f]{0,2})+");
        Matcher m = p.matcher(str);
        while (m.find()){
            str16 += m.group() + " " ;
        }
        return str16;
    }
}
