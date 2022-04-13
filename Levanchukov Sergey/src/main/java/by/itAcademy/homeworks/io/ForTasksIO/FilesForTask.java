package by.itAcademy.homeworks.io.ForTasksIO;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilesForTask {

    public  String listPrint () throws IOException {
        Path path=Path.of("Levanchukov Sergey\\src\\main\\resources\\text.txt");
        List <String> list= java.nio.file.Files.readAllLines(path);
        String str= String.valueOf(list);
        return str;
    }


    public void searchInLinePunct(String o){
        int count=0;
        Pattern pattern= Pattern.compile("[\\.]{3}|[\\?|\\!][\\!\\?\\.]*|[\\.,!?:;\\-\"()]");
        Matcher matcher=pattern.matcher(o);
        while (matcher.find()){
            count++;
        }
        System.out.println("Знаков припенания: "+count);
    }

    public void searchInLineWords(String o){
        int count=0;
        Pattern pattern=Pattern.compile("[А-Яа-яЁёA-Za-z0-9]+(?:[-][А-Яа-яЁёA-Za-z]+)*");
        Matcher matcher=pattern.matcher(o);
        while (matcher.find()){
            count++;
        }
        System.out.println("Слов в тексте: "+count);
    }


}
