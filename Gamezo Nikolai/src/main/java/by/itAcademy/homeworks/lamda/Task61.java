package by.itAcademy.homeworks.lamda;

/**
 * Задание 61
 * Напишите программу, которая для всех четных значений длиной от 1 до 20 дюймов:
 * печатает на экран значения в дюймах;
 * переводит значения в сантиметры;
 * печатает на экран сумму в сантиментах.
 */

import java.util.stream.IntStream;

public class Task61 {
    public static void main(String[] args) {
       System.out.print("\nСумма в сантиментах: " + IntStream.rangeClosed(1, 20)
               .filter((i) -> i % 2 == 0)
               .peek((e) -> System.out.print(e + " "))
               .mapToDouble(n -> (n * 2.54))
               .sum() + " См");
    }
}
