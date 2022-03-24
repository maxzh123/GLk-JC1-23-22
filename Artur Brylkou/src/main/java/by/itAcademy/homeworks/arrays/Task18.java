package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int last = 0;
       for (int i=0;i<array.length; i++) {
           array[i] = (int) (Math.random() * 100);
           last = array[array.length-1];
       }
        System.out.println(Arrays.toString(array));
        System.out.println("lastElement: "+ last);


    }
}
