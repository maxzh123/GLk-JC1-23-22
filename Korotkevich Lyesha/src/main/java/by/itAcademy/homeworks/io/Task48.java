package by.itAcademy.homeworks.io;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Создать файл с текстом, в котором присутствуют числа.
 * Найти все числа, вывести на экран, посчитать сумму, убрать все повторяющиеся числа и снова вывести на экран.
 */

public class Task48 {
    public static void main(String[] args) throws IOException {
        File file = new File("Korotkevich Lyesha/src/main/resources/Task47");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        StringBuilder text = new StringBuilder();
        String str = bufferedReader.readLine();
        while (str != null) {
            text.append(str);
            str = bufferedReader.readLine();
        }
        System.out.println("Все числа :" + chisla(text));
        System.out.println("Сумма: "+ sum(chisla(text)));
        System.out.println("Без повторяющихся: " + distinct(text));
    }

    public static ArrayList chisla(StringBuilder str){
        ArrayList<Integer> numbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("([0-9]+)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            numbers.add(Integer.parseInt(matcher.group()));
        }
        return numbers;
    }

    public static int sum(ArrayList<Integer> list){
        int sum = 0;
        for(int i : list){
            sum += i;
        }
        return sum;
    }
    public static HashSet<Integer> distinct(StringBuilder str){
        HashSet<Integer> set  = new HashSet<>(chisla(str));
        return set;
    }
}
