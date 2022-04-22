package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * > Создать список оценок учеников с помощью ArrayList, заполнить случайными
 * > оценками. Удалить неудовлетворительные оценки из списка.
 * */

public class Task39 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        ArrayCollection sad=new ArrayCollection();
        sad.arrayInitialization(s.nextInt());
        sad.printArray();
        sad.deleteUnsatisfiedRatings();
        System.out.println();
        sad.printArray();
    }

}
