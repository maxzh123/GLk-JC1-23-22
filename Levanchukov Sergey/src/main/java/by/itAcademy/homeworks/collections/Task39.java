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
        ArrayInitialization listOfRatings=new ArrayInitialization();
        Scanner s= new Scanner(System.in);

        listOfRatings.setCount(s.nextInt());

        listOfRatings.printArrayList(listOfRatings.deleteUnsatisfiedRatings(listOfRatings.arrayInitialization()));

    }

}
