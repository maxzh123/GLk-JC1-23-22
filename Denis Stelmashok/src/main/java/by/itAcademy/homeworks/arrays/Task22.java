package by.itAcademy.homeworks.arrays;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**Создайте переменную для массива из 10 элементов. Заполните его
        > произвольными значениями целочисленного типа. Выведите на экран, переверните
        > и снова выведите на экран (при переворачивании нежелательно создавать еще один
        > массив).*/
public class Task22 {
    public static void main(String[] args) {
        int [] array=new int[10];
        int [] newArray = mirrorArray(array);
        fillArrayWithRandom(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(mirrorArray(newArray)));
    }

    public static void fillArrayWithRandom(int @NotNull [] array) {
        for (int i=0; i < array.length; i++){
            array[i] = (int) (Math.random()*100);
        }
    }
    @Contract("_ -> param1")
    public static int [] mirrorArray(int @NotNull [] array) {
        int newArray;
        for (int i=0; i<array.length/2; i++){
            newArray=array[array.length-i-1];
            array[array.length-i-1]=array[i];
            array[i]=newArray;
        }
        return array;
    }
}
