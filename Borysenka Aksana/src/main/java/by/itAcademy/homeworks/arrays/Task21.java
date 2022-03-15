package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

public class Task21 {
    /**
     * Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
     * Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.
     * Если значений максимальных и минимальных несколько, то необходимо взять максимальное значение
     * разницы индексов между максимальным и минимальным значениями.
     */

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 2, 2, 3, 3, 4, 4};
        int max_el = findMaxEl(array);
        int min_el = findMinEl(array);
        int indMax = indMax(array,max_el);
        int indMin = indMin(array, min_el, max_el);
        int rez = calcSum(array, indMin, indMax);
        System.out.println(max_el + "," + min_el + "," + indMax + "," + indMin);
//        int[] array = new int[10];
//        elementArr(array);
        System.out.println("The sum of the array elements located between the minimum and maximum values.: " + rez);
    }

//    public static void elementArr(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 100);
//        }
//        System.out.println("Array: " + Arrays.toString(arr));
//    }

    public static int findMaxEl(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMinEl(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int indMin(int [] arr, int min_el,int max_el){
        int ind_max = 0;
        int ind_min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==max_el){
                ind_max = i;
            } if (arr[i]==min_el){
                ind_min = i;
            }
        }
        if (ind_min<ind_max){
            ind_min = findIndMinBeforeMax(arr, min_el);

        }
        else {
            ind_min = findIndMinAfterMax(arr, min_el);
        }
        return ind_min;
    }



    public static int findIndMinAfterMax(int[] arr, int min_el) {
        int ind_min = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j=i+1; j<arr.length;j++) {
                if (arr[i] == min_el && arr[i] == arr[j]) {
                    ind_min = i;
                }
            }
        }
        return ind_min;
    }

    public static int findIndMinBeforeMax(int[] arr, int min_el) {
        int ind_min = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j=i+1; j<arr.length;j++) {
                if (arr[i] == min_el && arr[i] == arr[j]) {
                    ind_min = i;
                    break;
                }
            }
        }
        return ind_min;
    }


    public static int indMax(int[] arr, int max_el) {
        int ind_max = 0;
        for (int i = 0; i < arr.length; i++) {
                    if (arr[i]==max_el){
                    ind_max = i;
            }
        }
        return ind_max;
    }



    public static int calcSum(int[] arr, int indMin, int indMax){
        int sum =0;
            for (int i = indMin+1; i < indMax; i++) {
                    sum +=arr[i];
            }
        return sum;
    }
}
