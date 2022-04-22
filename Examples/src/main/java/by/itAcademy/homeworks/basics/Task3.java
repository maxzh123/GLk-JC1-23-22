package by.itAcademy.homeworks.basics;

import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        int a=5;
        System.out.println(a==5?"Да":"Нет");
        String s = "acbca";
        System.out.println(!Stream
                .iterate(0, (i) -> ++i).limit(s.length() / 2)
                .parallel().map((i) -> s.charAt(i) != s.charAt(s.length() - 1 - i))
                .anyMatch((i) -> i == true));
    }
}
