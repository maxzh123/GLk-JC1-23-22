package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task26 {

    /**Task26
     * Введите с клавиатуры строку. Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.nextLine();
        System.out.println("Количество знаков препинания в строке " + getPunctCount(str));
    }


     public static int getPunctCount(String s){
        int count = 0;
        Pattern p = Pattern.compile("[\\.]{3}|[\\?|\\!][\\!\\?\\.]*|[\\.,!?:;\\-\"()]");
        Matcher m = p.matcher(s);
        while ((m.find())){
            count++;
        }
        return count;
    }

}
