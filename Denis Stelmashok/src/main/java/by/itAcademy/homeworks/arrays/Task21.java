package by.itAcademy.homeworks.arrays;

import java.util.Arrays;
/**> Создайте переменную для массива из 10 элементов. Заполните его
 > произвольными значениями целочисленного типа. Определите сумму элементов
 > массива, расположенных между минимальным и максимальным значениями. Если
 > значений максимальных и минимальных несколько, то необходимо взять
 > максимальное значение разницы индексов между максимальным и минимальным
 > значениями.*/
public class Task21 {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillArrayWithRandom(array);
        int maxIdx=findIndexOfMax(array);
        int minIdx=findIndexOfMin(array);
        int sum=summaMinMax(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Максимальный элемент " + array[maxIdx]);
        System.out.println("Минимальный элемент " + array[minIdx]);
        System.out.println("Индекс максимального " + maxIdx);
        System.out.println("Индекс минимального " + minIdx);
        System.out.println("Сумма " + sum);
    }
    public static  void fillArrayWithRandom(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
        }
    }
    public  static int findIndexOfMax(int[] array){
        int index1=0;
        for (int i=0;i<array.length;i++){
            if (array[i]>array[index1]){index1=i;}
        }
        return index1;
    }

    public static int findIndexOfMin(int[] array) {
        int index2=0;
        for (int i=0;i<array.length;i++){
            if (array[i]<array[index2]){index2=i;}
        }
        return index2;
    }
    public static int summaMinMax(int[] array) {
        int sum=0;
        int maxIdx=findIndexOfMax(array);
        int minIdx=findIndexOfMin(array);
        for (int i=0;i<array.length;i++){
            if (i>maxIdx && i<minIdx){
                sum=sum + array[i];
            }else if (i>minIdx && i<maxIdx){
                sum=sum + array[i];
            }
        }
        return sum;
    }
}
