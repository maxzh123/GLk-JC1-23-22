/*Создайте переменную для массива из 10 элементов.
Заполните его произвольными значениями целочисленного типа. Определите сумму элементов массива,
расположенных между минимальным и максимальным значениями.
 Если значений максимальных и минимальных несколько,
  то необходимо взять максимальное значение разницы индексов между максимальным и минимальным значениями.*/

package by.itAcademy.homeworks.arrays;

import java.util.Random;

public class Task21 {
    public static void main(String[] args) {
        Random ran = new Random();
        int array[] = new int[10];
        int s = 0;
        int indexMax = 0;
        int indexMin = 0;
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("");

        for(int i = 0;i<array.length;i++){
            if(array[i]>max){
                indexMax = i;
                max = array[i];
            }else{
                indexMax = i;
                min = array[i];
            }
            s+=array[i];
        }
        int sum = 0;
        for(int i = Math.min(indexMin,indexMax)+1;i<Math.max(indexMin,indexMax);++i){
            sum+=array[i];
        }
        System.out.println("Сумма элементов: "+sum);
    }
}