package by.itAcademy.homeworks.regexp;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
## Задание 29
        > Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке
        > шестнадцатеричных чисел, записанных по правилам Java, с помощью регулярных
        > выражений. Результат работы метода выведите на экран.*/
public class Task29 {
    public static void main(String[] args) {
        String s = "This tool helps0x14d0 cre0x14d1ate 0x0f4 and 3F2 debug regular expressions for" +
                " JavaScript. Just edit the above 0x00000bb9\n" +
                " expression like in a text editor or F2C22A3B6CA109A46D9B45DB3F2C578A try other " +
                "expre0x14d2ssions F4240 that are 7A120 avail0x14d4able from the menu." +
                " Subst0x14d3rings 1F4 within the 20A sample text can be marked as tests.0x14d5 Enjoy!";
        Pattern pattern = Pattern.compile("([0]{1}[x]{1}[A-Fa-f0-9]+)");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            System.out.print(matcher.group()+" ");
        }
    }
}
