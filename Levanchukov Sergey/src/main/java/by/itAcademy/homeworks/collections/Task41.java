package by.itAcademy.homeworks.collections;

import java.util.Scanner;

/**
 * > Создать список оценок учеников с помощью ArrayList, заполнить случайными
 * > оценками. Найти самую высокую оценку с использованием итератора.
 **/

public class Task41 {
    public static void main(String[] args) {
        ArrayCollection marks=new ArrayCollection();
        Scanner sc=new Scanner(System.in);
        marks.arrayInitialization(sc.nextInt());
        marks.printArray();
        System.out.println("\n");
        marks.choosingTheLargest(marks.getList());

    }
}
