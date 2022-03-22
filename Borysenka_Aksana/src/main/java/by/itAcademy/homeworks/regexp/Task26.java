package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task26 {

    /**Task26
     * Введите с клавиатуры строку. Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
     */

    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.nextLine();

        Pattern p = Pattern.compile("[,:;()\"-]+|[\\?|\\!][\\?\\!\\.]{0,3}|[\\.]{1,3}");
        Matcher m = p.matcher(str);
        int count = 0;
        while ((m.find())){
            count++;
        }
        System.out.println("Количество знаков препинания в строке " + count);
    }

    //[,:;()"-]+|[\?|\!][\?\!\.]{0,3}|[\.]{1,3}


}
