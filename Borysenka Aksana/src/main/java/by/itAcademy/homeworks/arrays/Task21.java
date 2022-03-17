package by.itAcademy.homeworks.arrays;

import by.itAcademy.homeworks.helper.Array;

import java.util.Arrays;

public class Task21 {
    /**
     * Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
     * Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.
     * Если значений максимальных и минимальных несколько, то необходимо взять максимальное значение
     * разницы индексов между максимальным и минимальным значениями.
     */

    public static void main(String[] args) {
        int[] array = new int [10];
        Array arrayHelper = new Array();
        arrayHelper.elementArr(array);
        System.out.println(Arrays.toString(array));
        System.out.println("The sum of the array elements located between the minimum and maximum values.: " + calcSum(array));
    }

    public static int calcSum(int[] arr){
        int sum =0;
        int max_dif=0;
        if (countMaxElArray(arr)==1 && countMinElArray(arr)==1) {
            if (indMinElArr(arr)<indMaxElArr(arr))
            for (int i = indMinElArr(arr) + 1; i < indMaxElArr(arr); i++) {
                sum += arr[i];
            }
            else{
                for (int i = indMaxElArr(arr)+1; i< indMinElArr(arr); i++){
                    sum += arr[i];
                }
            }
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr[indMinElArr(arr)]) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] == arr[indMaxElArr(arr)] && j - i > max_dif) {
                            max_dif = j - i;
                            sum = sumMaxBetweenIndMin_IndMax(arr, i, j);
                        }
                    }
                }
                if (arr[i] == arr[indMaxElArr(arr)]){
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] == arr[indMinElArr(arr)] && j - i > max_dif) {
                            max_dif = j - i;
                            sum = sumMaxBetweenIndMin_IndMax(arr, i, j);
                        }
                    }
                }
            }
        }
        return sum;
    }

    public static int indMaxElArr(int[] arr) {
        int max = arr[0];
        int ind_max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                ind_max = i;
            }
        }
        return ind_max;
    }

    public static int indMinElArr(int[] arr) {
        int min = arr[0];
        int ind_min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                ind_min = i;
            }
        }
        return ind_min;
    }

    public static int countMaxElArray(int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[indMaxElArr(arr)]){
                count++;
            }
        }
        return count;
    }

    public static int countMinElArray(int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[indMinElArr(arr)]){
                count++;
            }
        }
        return count;
    }

    public static int sumMaxBetweenIndMin_IndMax(int [] arr, int min, int max){
        int sum = 0;
            for (int i = min + 1; i < max; i++) {
                sum += arr[i];
            }
            return sum;
    }

}
