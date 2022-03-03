package by.itAcademy.homeworks.arrays;


import java.util.Arrays;

/**Создать переменную для массива ,запушить в нее случайные числа.последнее число вывести в консоль.*/

public class Task18 {
    public static void main(String[] args){
        int[] array=new int[10];
        fillArrayRandom(array);
        }

    public static void fillArrayRandom(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=(int) (Math.random()*10);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1]);

    }
}

