package by.itAcademy.homeworks.regexp;
import by.itAcademy.homeworks.helper.strScanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task28 {
    /**Task28
     * Введите с клавиатуры текст. Выведите на экран текст, составленный из последних букв всех слов из исходного текста.
     */

    public static void main (String[] args){
        strScanner strObject = new strScanner();
        String str = strObject.strEnter();
        System.out.println(getText(str));
    }


    public static String getText (String str){
        String text = "";
        Pattern p = Pattern.compile("([А-Яа-яЁёA-Za-z](?=\\s|\\.|,|;|:|\\!|\\?))*", Pattern.MULTILINE);
        Matcher m = p.matcher(str);
        while (m.find()){
            text += m.group();
        }
        return text;
    }
}
