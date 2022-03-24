package by.itAcademy.homeworks.loops;

import java.text.DecimalFormat;

/**
 * Задать произвольное целое число и вывести его в бухгалтерском формате,
 * то есть, начиная справа, каждые три позиции отделяются пробелом.
 * Например, число 20023143 должно быть выведено как 20 023 143.
 */

public class Task17 {
    public static void main(String[] args) {
        long number = 20_023_143L;
        String result = "";
        do  {
            result = number % 1000 + " " + result;
            number = number / 1000;
            }
        while (number > 0);
        System.out.println(result);
    }
}
