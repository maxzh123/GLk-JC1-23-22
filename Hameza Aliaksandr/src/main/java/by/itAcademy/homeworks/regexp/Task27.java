package by.itAcademy.homeworks.regexp;

import java.util.Scanner;

/**Введите с клавиатуры текст. Подсчитать количество слов в тексте.
 Учесть, что слова могут разделяться несколькими пробелами,
 в начале и конце текста также могут быть пробелы, но могут и отсутствовать.*/

public class Task27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] str1 = str.split("(\\s+|[!?]+|\\.{3}|[,;:\"'()\\.-]\\s?)");
        System.out.println(str1.length);
    }
}
