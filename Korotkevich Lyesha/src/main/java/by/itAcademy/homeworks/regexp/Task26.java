package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Введите с клавиатуры строку. Найти в строке не только запятые, но и другие знаки препинания.
    Подсчитать общее их количество.*/
public class Task26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        Pattern p = Pattern.compile("([!?]+|\\.{3}|[,;:\"'()\\.-])");
        Matcher m = p.matcher(str);
        while (m.find()){
            count++;
        }
        System.out.println(count);
    }
}
