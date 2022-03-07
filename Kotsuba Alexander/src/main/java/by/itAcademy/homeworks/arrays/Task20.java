/*Создайте переменную для массива из 10 элементов.
Заполните его произвольными значениями целочисленного типа. Найдите максимальный элемент и выведите его индекс.*/

package by.itAcademy.homeworks.arrays;

import java.util.Random;

public class Task20 {
    public static void main(String[] args) {
        int array[] = new int[10];
        int maxIndex = 1;
        int max = array[0] ;
        Random ran = new Random();
        for(int i = 0;i<array.length;i++){
            array[i] = ran.nextInt(100);
        }
        for(int i = 0;i<array.length;i++){
            System.out.print( " "+ array[i] );
        }
        for (int i=0; i<array.length;i++){
            if (array[i] > max){
                max =array[i];
                maxIndex = i+1;
            }
        }
        System.out.print("\nИндекс элемента: "+maxIndex);
        System.out.print("\nМаксимальный элемент массива: "+max);


    }
}
