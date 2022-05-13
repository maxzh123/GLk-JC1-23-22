package by.itAcademy.homeworks.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Задание 63
 * Сгенерируйте List коллекцию целых чисел из n элементов от minValue до maxValue.
 * Определить, содержатся ли в данной коллекции числа, которые делятся и на 3, и на 5 с помощью stream.
 */

public class Task63 {
    public static void main(String[] args) {
        int minValue = 0;
        int maxValue = 100;
        List<Integer> list = new ArrayList<>(IntStream.rangeClosed(minValue, maxValue).peek(System.out::println).boxed().collect(Collectors.toList()));
        if (list.stream().anyMatch(x -> (x % 3 == 0) && (x % 5 == 0))) {
            System.out.println("Числа, которые делятся на 3 и на 5:");
            list.stream().filter(x -> (x % 3 == 0) && (x % 5 == 0)).forEach(System.out::println);
        }
        else {
            System.out.println("Нет чисел, которые делятся на 3 и на 5");
        }
    }
}
