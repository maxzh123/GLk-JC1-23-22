package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**Создайте переменную для массива из 10 элементов.
 Заполните его произвольными значениями целочисленного типа.
 Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.
 Если значений максимальных и минимальных несколько,
 то необходимо взять максимальное значение разницы индексов между максимальным и минимальным значениями.
 */

public class Task21 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array1 = randomArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Максимальный массив" +findMaxIndex(array));
        System.out.println("Минимальный массив" +findMinIndex(array));
        System.out.println("Сумма =" + culcSum(array));
    }
    public static int[] randomArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        return array;
    }
    public static int culcSum (int[] array){
        int maxIndex = findMaxIndex(array);
        int minIndex = findMinIndex(array);
        int result = 0;
        for (int i = minIndex + 1; i < maxIndex - 1; i++) {
            result += array[i];
        }
        return result;
    }
    public static int findMinIndex (int[]array) {
        int minArray = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (minArray > array[i]) {
                minArray = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
        public static int findMaxIndex (int[]array){
            int maxArray = array[0];
            int maxIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if (maxArray < array[i]) {
                    maxArray = array[i];
                    maxIndex = i;
                }
            }
            return maxIndex;
        }
    }


