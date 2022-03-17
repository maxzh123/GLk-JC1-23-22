package by.itAcademy.homeworks.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * ## Задание 19
 * > Создайте переменную для массива из 10 элементов (другим способом).
 * > Заполните его произвольными значениями целочисленного типа и выведите на
 * > экран элементы, стоящие на четных позициях.
 */
public class Task19 {
    Random random = new Random();

    public int[] getArray(int[] array){
        setRandom(array);
        setArray(array);
        return array;
    }
    public void setRandom(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = random.ints(1,50).findFirst().getAsInt();
        }
    }
    public void setArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i%2 == 0){
                System.out.println(array[i]);
            }
        }
    }
}
