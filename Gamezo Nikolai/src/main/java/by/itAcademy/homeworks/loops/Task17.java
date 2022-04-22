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
        //    System.out.println(new DecimalFormat(",###").format(20023143));
        int num = 1234567890;
        StringBuffer str = new StringBuffer(Integer.toString(num));
        int n = str.length();
        for (int i = n / 3 + 1; i > 0; i--) {
            str.insert(n, " ");
            n = n - 3;
        }
        System.out.println(str);
    }
}


