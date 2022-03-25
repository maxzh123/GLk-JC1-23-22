package by.itAcademy.homeworks.loops;

import javafx.scene.transform.Scale;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Задать произвольное целое число и вывести его в бухгалтерском формате,
 * то есть, начиная справа, каждые три позиции отделяются пробелом.
 * Например, число 20023143 должно быть выведено как 20 023 143.
 */

public class Task17 {
    public static void main(String[] args) {
//     код Николая так и не понял
//        long number = 20_023_143L;
//        String result = "";
//        do  {
//            result = number % 1000 + " " + result;
//            number = number / 1000;
//            }
//        while (number > 0);
//        System.out.println(result);
        Scanner console = new Scanner(System.in);
        long numb = console.nextLong();
        System.out.print(new DecimalFormat( "###,###" ).format(numb));
    }
}
