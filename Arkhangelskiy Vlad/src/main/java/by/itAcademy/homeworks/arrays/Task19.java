package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**
 * Создайте переменную для массива из 10 элементов (другим способом).
 * Заполните его произвольными значениями целочисленного типа и выведите на экран элементы,
 * стоящие на четных позициях.
 */

public class Task19 {
    public static void main(String[] args) {

        int [] array = new int[10] ;

        lastNumber(array);
        even(array);

    }
    public static void lastNumber (int [] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
    }
    public static void  even (int [] array){
        for(int i = 0; i < array.length; i++){
            if (i % 2 == 0 ){
                System.out.println(array[i]);
            }
        }


    }

}