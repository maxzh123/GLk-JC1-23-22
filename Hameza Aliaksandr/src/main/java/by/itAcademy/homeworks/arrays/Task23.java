package by.itAcademy.homeworks.arrays;
 /**Cоздать двухмерный квадратный массив и заполнить его «бабочкой», то есть таким образом:
         1 1 1 1 1
         0 1 1 1 0
         0 0 1 0 0
         0 1 1 1 0
         1 1 1 1 1
         */
public class Task23 {
     public static void main(String[] args) {
         int array [][] = new int[5][5];
         butterflyArray(array);
         printArray(array);
     }

     public static int [][] butterflyArray(int[][] array){
         for (int i = 0; i < array.length; i++){
             for (int j = 0; j < array.length; j++){
                 if (( i <= j && i <= array.length - 1 - j) || (i >= j && i >= array.length - 1 - j)){
                     array[i][j] = 1;
                 }
         }
     }
         return array;
}
     public static void printArray(int[][]array) {
         for (int i = 0; i < array.length; i++){
             for (int j = 0; j < array.length; j++){
                 System.out.print(array[i][j]+" ");
             }
             System.out.print("\n");
         }
     }
     }
