package by.itAcademy.homeworks.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 48
 * Создать файл с текстом, в котором присутствуют числа. Найти все числа, вывести на экран, посчитать сумму,
 * убрать все повторяющиеся числа и снова вывести на экран.
 */

public class Task48 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Melanich Olga\\src\\main\\resources\\Task48"));
        String str;
        String string = "";
        while ((str = reader.readLine()) != null) {
            string += str;
        }
        findAllNumbers(string);
        System.out.println(list);
        System.out.println(sumNumbers(list));
        System.out.println(removeAllDuplicateNumbers(list));
    }

    private static List<Integer> list = new ArrayList<>();

    public static void findAllNumbers(String string) {
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            list.add(Integer.parseInt(matcher.group()));
        }
    }

    public static int sumNumbers(List<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }

    public static Set<Integer> removeAllDuplicateNumbers(List<Integer> list) {
        Set<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.addAll(list);
        return linkedSet;
    }
}

//    public static List<Integer> removeAllDuplicateNumbers(List<Integer> list){
//        List<Integer> l = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            if (!l.contains(list.get(i))){
//                l.add(list.get(i));
//            }
//        }
//        return l;