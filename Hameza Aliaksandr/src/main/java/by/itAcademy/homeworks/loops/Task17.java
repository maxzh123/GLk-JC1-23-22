package by.itAcademy.homeworks.loops;

import java.text.DecimalFormat;

/**
 * Задание 17
 * Задать произвольное целое число и вывести его в бухгалтерском формате,
 * то есть, начиная справа, каждые три позиции отделяются пробелом.
 * Например, число 20023143 должно быть выведено как 20 023 143.
 */

public class Task17 {
    public static void main(String[] args) {
        int num = 2002314300;
        System.out.println(new DecimalFormat("###,###").format(num));

    }
}
