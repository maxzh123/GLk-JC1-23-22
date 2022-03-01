package by.itAcademy.homeworks.arrays;

/**
 *Создать массив и вывести что стоит на четных позициях
 */

public class Task19 {
    public static void main(String[] args){
        int array[]={12,132,14,12,312,35,73,346,5};
        oddPositionsArray(array);
    }
    public static void oddPositionsArray (int[] arr){
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
