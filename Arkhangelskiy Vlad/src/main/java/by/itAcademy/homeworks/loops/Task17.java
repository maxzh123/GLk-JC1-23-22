package by.itAcademy.homeworks.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


/**
 * Задание 16
 * Задать произвольное целое число и вывести его в бухгалтерском формате,
 * то есть, начиная справа, каждые три позиции отделяются пробелом.
 * Например, число 20023143 должно быть выведено как 20 023 143.
 */

public class Task17 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число  ");
        int numb = Integer.parseInt(reader.readLine());

        DecimalFormat df = new DecimalFormat("###,###");
        System.out.println(df.format(numb));
    }


}
