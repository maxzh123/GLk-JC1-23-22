package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

public class Task21 {
    public static void main(String[] args) {
        int [] array = new int[10];
        for (int i =0; i<array.length; i++){
            array[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(array));
        int minIndex = 0;
        int maxIndex = 0;
        int max = array[0];
        int min = array[0];
        for (int i =0; i<array.length; i++){
            if(array[i]>max){
                maxIndex = i;
                max = array[i];
            }else
                if (array[i]<min){
                    minIndex = i;
                    min = array[i];
                }
        }
          int sum = 0;
        for (int i = Math.min(minIndex,maxIndex)+1;i < Math.max(minIndex,maxIndex);i++ ){
            sum+= array[i];
        }
        System.out.println(sum);
    }
}
