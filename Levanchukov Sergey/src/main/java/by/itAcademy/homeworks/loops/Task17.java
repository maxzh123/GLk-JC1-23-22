package by.itAcademy.homeworks.loops;

import java.text.NumberFormat;
import java.util.Scanner;

/** Задать произвольное целое число и вывести его в бухгалтерском формате, то
 *  есть, начиная справа, каждые три позиции отделяются пробелом. Например, число
 *  20023143 должно быть выведено как 20 023 143.*/
public class Task17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numb=sc.nextInt();
        NumberFormat f=NumberFormat.getInstance();//магия которую нашел в интернете
        System.out.println(f.format(numb));
    }
}
