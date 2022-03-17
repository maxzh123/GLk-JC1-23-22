package by.itAcademy.homeworks.arrays;

/**Создайте переменную для массива из 10 элементов.
 Заполните его произвольными значениями целочисленного типа и выведите последний элемент массива на экран.*/

public class Task18 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out.println(last(fill(arr)));
    }
    public static int[] fill(int array[]){
        for (int i=0; i<array.length;i++){
            array[i] = (int)(Math.random()*10+1);
        }
        return array;
    }
    public static int last(int array[]){
        return array[array.length -1];
    }
}
