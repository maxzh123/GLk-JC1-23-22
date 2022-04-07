package by.itAcademy.homeworks.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Задание 44
 * Написать собственное исключение от Exception. Сгенерировать код, который будет выбрасывать его и обрабатывать.
 * Результат работы программы вывести на экран.
 */

public class Task44 {
    public static void main(String[] args) {
        try {
            throw new MyException("MyException");
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }
    }
}
