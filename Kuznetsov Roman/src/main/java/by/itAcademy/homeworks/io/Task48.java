package by.itAcademy.homeworks.io;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task48 {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        String fileData = Task47.readFile(".\\Kuznetsov Roman\\src\\main\\java\\by\\itAcademy\\homeworks\\io\\48.txt");
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(fileData);
        while (matcher.find()) {
            arrayList.add(Integer.parseInt(matcher.group()));
        }
        int sum=0;
        HashSet<Integer> set = new HashSet<>();
        for (int s : arrayList) {
            sum += s;
            set.add(s);
        }
        System.out.println("Source file:"+fileData);
        System.out.println("Sum of integers:"+sum);
        System.out.println("Filtered numbers:"+set.toString());
    }
}
