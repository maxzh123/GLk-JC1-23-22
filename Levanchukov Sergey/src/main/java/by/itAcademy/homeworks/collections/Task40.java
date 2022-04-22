package by.itAcademy.homeworks.collections;

import java.util.Scanner;

/**
 * > Создать коллекцию, заполнить ее случайными целыми числами. Удалить
 * > повторяющиеся числа.
 **/

public class Task40 {
    public static void main(String[] args) {
        ArrayCollection array=new ArrayCollection();
        Scanner sc=new Scanner(System.in);
        array.arrayInitialization(sc.nextInt());
        System.out.println(array.getList());
        array.deleteRecurringNumbers();
        System.out.println(array.getList());
    }

}
