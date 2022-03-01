package by.itAcademy.homeworks.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * > Создайте переменную для массива из 10 элементов. Заполните его
 * > произвольными значениями целочисленного типа. Определите сумму элементов
 * > массива, расположенных между минимальным и максимальным значениями. Если
 * > значений максимальных и минимальных несколько, то необходимо взять
 * > максимальное значение разницы индексов между максимальным и минимальным
 * > значениями.
 **/

public class Task21 {

       public static void main(String[] args) {

           int [] array=new int[4];
           initArray(array);
           System.out.println(Arrays.toString(array));
           System.out.println(minMax(array));

    }

    /**инициализация массива*/
    public static void initArray (int [] arr){
       for (int i=0 ;i< arr.length;i++){
           arr[i]=(int)(Math.random()*100);
       }
    }

    /**поиск минимального и максимального значения*/
    //Посмотрел как делал Роман, увидел класс IndexSearcher не стал использовать так как не очень понял как работает, но потом залез в сам класс
    //и просидев минут 10 понял, что идти по массиву с одной стороны для поиска максимума и минимума не очень хорошая идея, в общем  если надо могу переделать
    //с использованием класса IndexSearcher теперь я знаю как он работает
    public static int minMax(int [] arr){
        int min=arr[arr.length-1];
        int indexMin=arr.length-1,indexMax = 0;
        int max=arr[0];
        for (int i=arr.length-2;i>=0;i--){
            if (arr[i]<min){
                min=arr[i];
                indexMin=i;
            }
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                indexMax=i;
            }
        }
        return sumArray(arr, indexMax,indexMin);}

    /**нахождение суммы от минимума до максимума*/
    public static int sumArray (int [] arr, int indexMax, int indexMin){
        int sum=0;
        {
            if(indexMax>indexMin){
                for(int i=indexMin;indexMin<indexMax;indexMin++){sum=sum+arr[indexMin];}
            }
            if(indexMin>indexMax){
                for(int i=indexMax;indexMax<indexMin;indexMax++){sum=sum+arr[indexMax];}
            }
        }
        return sum;
    }

}
