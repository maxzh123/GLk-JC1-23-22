package by.itAcademy.homeworks.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 48
 * Создать файл с текстом, в котором присутствуют числа.
 * Найти все числа, вывести на экран, посчитать сумму, убрать все повторяющиеся числа и снова вывести на экран.
 */

public class Task48 {
    public static void main(String[] args) throws IOException {
        String string = "";
        String str;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Gamezo Nikolai\\src\\main\\resources\\ForTask48"));
        str = bufferedReader.readLine();
        while (str != null) {
            str = bufferedReader.readLine();
            if (str != null) {
                string = string + str + " ";
            }
        }
        System.out.println("Все числа: " + findNumbers(string));
        System.out.println("Сумма чисел: " + calcSum(findNumbers(string)));
        System.out.println("Без повторяющихся: " + noRepeatingNumbers(findNumbers(string)));
    }
    public static ArrayList findNumbers(String string){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Pattern p = Pattern.compile("([0-9]+)");
        Matcher m = p.matcher(string);
        while (m.find()) {
            arrayList.add(Integer.parseInt(m.group()));
        }
        return arrayList;
    }
    public static int calcSum(ArrayList<Integer> arrayList){
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum = sum + arrayList.get(i);
        }
        return sum;
    }
    public static List<Integer> noRepeatingNumbers(ArrayList<Integer> array){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (!arrayList.contains(array.get(i))) {
                arrayList.add(array.get(i));
            }
        }
        return arrayList;
    }
}
