package by.itAcademy.homeworks.exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Задание 43
 * Написать код, который выбрасывает NullPointerException. Написать обработчик этого исключения и
 * вывести на экран сообщение, которое будет содержать описание данного исключения.
 */

public class Task43 {
    public static void main(String[] args) {
        String str = null;

        try {
            str.toString();
        } catch (NullPointerException e) {
            System.out.println("Cannot invoke String.toString() because is null");
        }
    }
}
