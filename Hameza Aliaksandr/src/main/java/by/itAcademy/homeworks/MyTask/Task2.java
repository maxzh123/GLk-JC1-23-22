package by.itAcademy.homeworks.MyTask;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int array[] = new int[10];
        randomArray(array);
        System.out.println("Исходный массив " + Arrays.toString(array));
        System.out.println("Максимальный элемент" + maxElement(array));
        System.out.println("Минимальный элемент" +minElement(array));
        System.out.println("Замена массива =" + Arrays.toString(replaceElement(array)));
    }
        public static int[] randomArray ( int[] array){
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * (600 + 1) - 300);
            }
            return array;
        }
        public static int maxElement ( int array[]){
            int max_el = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max_el) {
                    max_el = array[i];
                    ;
                }
            }
            return max_el;
        }
        public static int minElement ( int[] array){
            int min_el = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min_el) {
                    min_el = array[i];
                }
            }
            return min_el;
        }
        public static int findMaxIndex ( int[] array){
            int max_el = array[0];
            int maxIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if (max_el < array[i]) {
                    max_el = array[i];
                    maxIndex = i;
                }
            }
            return maxIndex;
        }
        public static int findMinIndex ( int[] array){
            int min_el = array[0];
            int minIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if (min_el > array[i]) {
                    min_el = array[i];
                    minIndex = i;
                }
            }
            return minIndex;
        }
        public static int[] replaceElement ( int[] array){
            array[findMaxIndex(array)] = array[findMinIndex(array)] * array[findMaxIndex(array)];
            return array;
        }
    }
