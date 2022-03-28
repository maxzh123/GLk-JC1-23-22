package by.itAcademy.homeworks.collections;

import java.util.Scanner;

/**
 * > Создать коллекцию, заполнить ее случайными целыми числами. Удалить
 * > повторяющиеся числа.
 **/

public class Task40 {
    public static void main(String[] args) {
        ArrayInitialization sc=new ArrayInitialization();
        Scanner s= new Scanner(System.in);
        sc.setCount(s.nextInt());
        sc.deleteRecurringNumbers();
    }

}
