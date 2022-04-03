package by.itAcademy.homeworks.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ## Задание 27
        > Введите с клавиатуры текст. Подсчитать количество слов в тексте. Учесть, что
        > слова могут разделяться несколькими пробелами, в начале и конце текста также
        > могут быть пробелы, но могут и отсутствовать.*/
public class Task27 {
    public static void main(String[] args) {
        int sum = 0;
        String st = "Структура  npn\n" +
                "Напряжение коллектор-эмиттер, не более: 100 В\n" +
                "Напряжение коллектор-база, не более: 100 В\n" +
                "Напряжение эмиттер-база, не более: 5 V\n" +
                "Ток коллектора, не более: 6 А\n" +
                "Рассеиваемая мощность коллектора, не более: 65 Вт\n" +
                "Коэффициент усиления транзистора по току (hfe): от 15 до 75\n" +
                "Граничная частота коэффициента передачи тока: 3 МГц\n" +
                "Корпус: TO-220";
        Pattern pattern = Pattern.compile("[A-Za-zА-Я-а-яЁё]+");
        Matcher matcher = pattern.matcher(st);
        while (matcher.find()){
        sum++;
        }
        System.out.println("Слов в тексте = "+sum);
    }
}
