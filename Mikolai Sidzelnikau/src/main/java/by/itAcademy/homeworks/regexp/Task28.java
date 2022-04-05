package by.itAcademy.homeworks.regexp;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ## Задание 28
        > Введите с клавиатуры текст. Выведите на экран текст, составленный из
        > последних букв всех слов из исходного текста.*/
public class Task28 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        Pattern pattern = Pattern.compile("([A-Za-zА-Яа-яЁё]{1})+([A-Za-zА-Яа-яЁё]{1})");
        Matcher matcher = pattern.matcher(sc);
        while (matcher.find()){
            sum++;
            System.out.print(matcher.group(2));
        }
        System.out.println();
        System.out.println(sum);
    }
}
