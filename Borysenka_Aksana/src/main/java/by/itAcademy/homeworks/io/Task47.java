package by.itAcademy.homeworks.io;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task47 {

    /**Task47
     * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
     * Вывести результат на экран.
     */

    public static void main(String[] args) throws IOException {
        String str = "";
        BufferedReader br = new BufferedReader(new FileReader("Borysenka_Aksana\\src\\main\\resources\\ForTask47.txt"));
        if (br.equals(null)) {
            System.out.println("Путь должен быть не null");
        }else {
            String strBr;
            while ((strBr = br.readLine()) != null) {
                str += strBr + "\n";
            }
            System.out.println("Amount of words: " + getCountWords(str));
            System.out.println("Amount of punctuation marks: " + getPunctCount(str));
        }
        br.close();
    }

    public static int getCountWords(String str) {
        Pattern p = Pattern.compile("[А-Яа-яЁёA-Za-z]+(?:[-][А-Яа-яЁёA-Za-z]+)*", Pattern.MULTILINE);
        Matcher m = p.matcher(str);
        int count = 0;
        while (m.find()){
            count++;
        }
        return count;
    }

    public static int getPunctCount(String str){
        int count = 0;
        Pattern p = Pattern.compile("[\\.]{3}|[\\?|\\!][\\!\\?\\.]*|[\\.,!?:;\\-\"()]", Pattern.MULTILINE);
        Matcher m = p.matcher(str);
        while ((m.find())){
            count++;
        }
        return count;
    }

}
