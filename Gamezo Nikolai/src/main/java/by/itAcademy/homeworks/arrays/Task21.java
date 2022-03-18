package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**
 * Задание 21
 * Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
 * Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.
 * Если значений максимальных и минимальных несколько, то необходимо взять максимальное значение разницы индексов между максимальным и минимальным значениями.
 */

public class Task21 {
    public static void main(String[] args) {
       // int l = 10;
       // int array[] = new int[l];
      //  fillArray(array);
        int array[] = {2, 9, 1, 1, 1, 2, 2, 2, 2};
        System.out.println(Arrays.toString(array));
       // System.out.println(minIndex(array));
       // System.out.println(calcSum(array));
        System.out.println(checkTwo(array));

      //  System.out.println(newCalcSum(array));
       // System.out.println(maxIndex(array));
      //  System.out.println(calcSum(array));
       // System.out.println("Максимальный элемент " + maxElement(array));
        // System.out.println("Индекс максимального элемента " + maxIndex(array));
    }

    //метод заполнения массива случайными числами
    public static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    //метод поиска индекса максимального элемента массива
    public static int maxIndex(int[] array) {
        int maxindex = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                maxindex = i;
            }
        }
        return maxindex;
    }

    //метод поиска индекса минимального элемента массива
    public static int minIndex(int[] array) {
        int minindex = 0;
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                minindex = i;
            }
        }
        return minindex;
    }



    //метод проверки на наличие двух максимальных или минимальных значений (в процессе создания)
    public static int checkTwo(int[] array) {
        int sum = 0;
        int l = 0;
        int t = 0;
        int indexNewMax = 0;
        int indexNewMin = 0;
        if (countMin(array) ==1 && countMax(array) ==1) {
            sum = calcSum(array);
        }
        else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == array[maxIndex(array)] && i != maxIndex(array)) {
                    l = i;
                    for (int j = 0; i < array.length; i++) {
                        if (l - maxIndex(array) < l - i) {
                            indexNewMax = i;
                        }
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] == array[minIndex(array)] && i != minIndex(array)) {
                    t = i;
                    for (int j = 0; i < array.length; i++) {
                        if (t - minIndex(array) < t - i) {
                            indexNewMin = i;
                        }
                    }
                }
            }
            sum = newCalcSum(array, indexNewMin, indexNewMax);
        }
        return sum;
    }

    //метод подсчёта количества минимальных значений
    public static int countMin(int [] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == array[minIndex(array)]){
                count++;
            }
        }
        return count;
    }

    //метод подсчёта количества максимальных значений
    public static int countMax(int [] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == array[maxIndex(array)]){
                count++;
            }
        }
        return count;
    }



    //вычисление суммы элементов массива между минимальным и максимальным значением
    public static int calcSum(int[] array) {
        int sum = 0;
        if (minIndex(array) < maxIndex(array)) {
            for (int i = minIndex(array); i < maxIndex(array) + 1; ++i) {
                sum = sum + array[i];
            }
        } else {
            for (int j = minIndex(array); j > maxIndex(array) - 1; j--) {
                sum = sum + array[j];
            }
        }
        return sum;
    }


    //вычисление суммы элементов массива между минимальным и максимальным значением New
    public static int newCalcSum(int[] array, int indexNewMin, int indexNewMax) {
        int sum = 0;
        if (indexNewMin < indexNewMax) {
            for (int i = indexNewMin; i < indexNewMax + 1; ++i) {
                sum = sum + array[i];
            }
        } else {
            for (int j = indexNewMin; j > indexNewMax - 1; j--) {
                sum = sum + array[j];
            }
        }
        return sum;
    }
}