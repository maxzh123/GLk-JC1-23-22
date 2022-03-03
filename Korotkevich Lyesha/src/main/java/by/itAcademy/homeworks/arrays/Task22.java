package by.itAcademy.homeworks.arrays;

/**Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
 Выведите на экран, переверните и снова выведите на экран (при переворачивании нежелательно создавать еще один массив).*/

public class Task22 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr = fill(arr);
        output(arr);
        output_reverse(arr);
    }

    public static int[] fill(int array[]){
        for (int i=0; i<array.length;i++){
            array[i] = (int)(Math.random()*10+1);
        }
        return array;
    }

    public static void output(int[] array){
        for (int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void output_reverse(int[] array){
        for (int i=array.length-1; i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
