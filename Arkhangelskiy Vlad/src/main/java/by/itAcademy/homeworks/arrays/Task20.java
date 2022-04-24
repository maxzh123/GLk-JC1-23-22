package by.itAcademy.homeworks.arrays;


import java.util.Arrays;

/**
 * Создайте переменную для массива из 10 элементов.
 * Заполните его произвольными значениями целочисленного типа. Найдите максимальный элемент и выведите его индекс.
 */
public class Task20 {

    public static void main(String[] args) {

        int [] array = new int[10] ;

        fill(array);
        max(array);

    }
    public static void fill (int [] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
    }
    public static void  max (int [] array){

        int max = array[0];
        int maxIndex = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println( "максимальный элемент массива: " + max);
        System.out.println("Индекс максимального элемента массива: " + maxIndex);
    }


    }




