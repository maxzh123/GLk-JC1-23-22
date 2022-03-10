package by.itAcademy.homeworks.arrays;
import java.util.Arrays;

public class Task21 {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillArray(array);
        int indexMax=maxIndexOfArray(array);
        int indexMin=minIndexOfArray(array);
        sumBetweenElements(array,indexMax,indexMin);
    }

    public static int[] fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*10);

        }System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static int maxIndexOfArray(int[] arr){
        int maxIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[0]<arr[i]){
                arr[0]=arr[i];
                maxIndex=i;
            }
        }
        System.out.println("Максимальный индекс: "+maxIndex);
        return maxIndex;
    }
    public static int minIndexOfArray(int[] arr){
        int minIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[0]>arr[i]){
                arr[0]=arr[i];
                minIndex=i;
            }
        }System.out.println("Минимальный индекс: "+minIndex);
        return minIndex;
    }
    public static int sumBetweenElements(int[] arr,int max,int min){
        int sumOfEl=0;
        for(int i=0;i<arr.length;i++){
            if(i>max&&i<min){
                sumOfEl=sumOfEl+arr[i];
            }else if(i<max&&i>min){
                sumOfEl=sumOfEl+arr[i];
            }
        }
        System.out.println("Сумма элементов между максимальным и минимальным индексами= "+sumOfEl);
        return sumOfEl;
    }
}