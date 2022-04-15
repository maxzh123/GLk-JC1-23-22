package by.itAcademy.homeworks.io;

import by.itAcademy.homeworks.io.ForTasksIO.FileWithNumber;

import java.io.IOException;

/**
 * Создать файл с текстом, в котором присутствуют числа.
 * Найти все числа
 * Вывести на экран
 * Посчитать сумму
 * Убрать все повторяющиеся числа и снова вывести на экран.
 **/

public class Task48 {
    public static void main(String[] args) throws IOException {
        FileWithNumber ff=new FileWithNumber();
        System.out.println(ff.readAFile());
        System.out.println(ff.addToArrayList(ff.readAFile()));
        System.out.println(ff.sumArray(ff.addToArrayList(ff.readAFile())));
        System.out.println(ff.searchForRepetitions(ff.addToArrayList(ff.readAFile())));
    }
}
