package by.itAcademy.homeworks.io;

import java.io.*;

import java.net.URL;
import java.util.logging.FileHandler;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task47 {
    public static void main(String[] args) {
        String filedata= readFile(String.valueOf(Task47.class.getResource("itAcademy\\homeworks\\io\\47.txt")));
        Pattern pattern = Pattern.compile("[.]{3,}|\\?+!+|!+\\?+|!+|\\?+|[.,;:\\-\"]");
        Matcher matcher = pattern.matcher(filedata);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("Знаки препинания:"+ count);
        System.out.println("Слова:"+ filedata.split(" ").length);
    }
    public static String readFile(String path){
        String fileData = "";
        try  {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String str = bufferedReader.readLine();
            while (str != null) {
                fileData += str + "\n";
                str = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileData;
    }

}
