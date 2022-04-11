package by.itAcademy.homeworks.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Path;

/**
 * Задание 45
 * Написать метод, который будет возбуждать исключение и обработать это исключение на уровне выше.
 * Результат работы программы вывести на экран.
 */

public class Task45 {
    public static void main(String[] args) {
        try {
            throwFileNotFoundException();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void throwFileNotFoundException() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("c:/gdgd"));
    }
}
//        try {
//            throwsException();
//            throwFileNotFoundException();
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//
//    public static void throwsException() throws NullPointerException {
//        throw new NullPointerException("Exception from throwsException()");
//    }
//
//    public static void throwFileNotFoundException() throws FileNotFoundException {
//        BufferedReader reader = new BufferedReader(new FileReader("c:/gdgd"));
//    }
//}


