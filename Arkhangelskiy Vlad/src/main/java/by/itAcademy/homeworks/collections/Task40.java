package by.itAcademy.homeworks.collections;

/**
 * Task 40
 * Создать коллекцию, заполнить ее случайными целыми числами. Удалить повторяющиеся числа.
 */

import java.util.ArrayList;
import java.util.Random;

public class Task40 {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            numbers.add(random.nextInt(11));
        }

        System.out.println(uniqueNumbers(numbers));
    }
    public static ArrayList<Integer> uniqueNumbers(ArrayList<Integer> numbers) {

        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (!uniqueNumbers.contains(numbers.get(i))) {
                uniqueNumbers.add(numbers.get(i));
            }

        }
        return uniqueNumbers;
    }
}