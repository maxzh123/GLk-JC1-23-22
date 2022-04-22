package by.itAcademy.homeworks.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task26 {
    public static void main(String[] args) {
//        Pattern p=Pattern.compile("[A-Za-z]+(?:[-][a-z]+)"
        Pattern p=Pattern.compile("[a-zA-Z]*([a-z])"
                ,Pattern.MULTILINE);
        Pattern p2=Pattern.compile("([A-Za-z])$");
        Matcher m=p.matcher("01 05 2021 Test admin@example.com\n" +
                "08 05 2021 Test admin@exle.com\n" +
                "01 15 2221 Test odmin@example.com\n" +
                "11 05 2021 Test ad@example.com");
        while(m.find()){
            System.out.print("Найдено:");
            Matcher m2=p2.matcher(m.group(0));
            if (m2.find()){
                System.out.println("Слово "+m.group(0)+" последняя буква "+m2.group(1));
            }
        }

        System.out.println("");
        System.out.println("");
        System.out.println("admin@ex.com".matches("[a-zA-Z0-9_-]+\\@[a-zA-Z0-9_\\.-]+"));

    }
}
