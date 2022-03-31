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

        StringBuilder sb = new StringBuilder();
        Pattern words = Pattern.compile("[A-Za-zFА-Яа-яЁ-ё]+", Pattern.MULTILINE);
        Pattern lastLetterWord = Pattern.compile("[A-Za-zFА-Яa-zа-яё]$", Pattern.MULTILINE);
        Matcher mWords = words.matcher(str);
        while (mWords.find()){

            Matcher mLastLetterWord = lastLetterWord.matcher(mWords.group());
            if(mLastLetterWord.find())
            sb.append(mLastLetterWord.group());
        }
        return sb.toString();
    }
}
