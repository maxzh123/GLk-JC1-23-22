package by.itAcademy.homeworks.arrays;

import static java.lang.System.out;

/**
 * > Создать двухмерный квадратный массив и заполнить его «бабочкой», то есть
 * > таким образом:
 * 	1 1 1 1 1
 * 	0 1 1 1 0
 * 	0 0 1 0 0
 * 	0 1 1 1 0
 * 	1 1 1 1 1
 * 	*/

//Решение задания нашел, понял как работает, но было бы сложно самому реализовать. Исправил его только написанием масивов в разных методах

public class Task23 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[][] = new int[5][5];
        int i=0, j=0;
        firstHalfArray(arr,i,j);
        //printArray(arr);
    }

    /**Заполняем первую половину массива необходимыми значениями*/
    public static void firstHalfArray (int [][] arr, int i, int j) {
        for (i = 0; i < arr.length / 2 + 1; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if ((j < i) || (j >= (arr[i].length - i)))
                    arr[i][j] = 0;
                else
                    arr[i][j] = 1;
            }
        }
        secondHalfArray(arr, i, j);
    }


    /**Заполняем вторую половину массива с конца необходимыми значениями*/
    public static void secondHalfArray (int [][] arr,int i,int j) {
        for (i = arr.length - 1; i >= arr.length / 2 + 1; i--) {
            for (j = 0; j < arr[i].length; j++) {
                if ((j < (arr[i].length - 1 - i)) || (j > i))
                    arr[i][j] = 0;
                else
                    arr[i][j] = 1;
            }
        }
        printArray(arr);
    }

    /**Выводим получаный массив*/
    public static void printArray(int [][] arr){
        int i=0;
        int j=0;
        for (i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                out.print(arr[i][j]);
            }
            out.println(" ");
        }
    }

}
