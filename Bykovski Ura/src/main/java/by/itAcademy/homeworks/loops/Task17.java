package by.itAcademy.homeworks.loops;

import java.util.Scanner;

//Задать произвольное целое число и вывести его в бухгалтерском формате, то есть, начиная справа, каждые три позиции отделяются пробелом. Например, число 20023143 должно быть выведено как 20 023 143.
public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextInt();
        String right_form = "";
        do {
            long three=number%1000;
            String yoru=Long.toString(three);
            right_form=yoru+" "+right_form;
            number /= 1000;
        } while (number > 0);
        System.out.println(right_form);
    }
}
