package by.itAcademy.homeworks.lamda;

import java.util.stream.IntStream;

public class Task61 {

    /**Task61
     * Напишите программу, которая для всех четных значений длиной от 1 до 20 дюймов:
     * печатает на экран значения в дюймах;
     * переводит значения в сантиметры;
     * печатает на экран сумму в сантиментах.
     */

    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,20)
                .filter((i) -> i%2 == 0)
                .peek((e) -> System.out.println(e)) 
                .mapToDouble(n -> (n*2.54))
                .sum()
        );
    }
}
