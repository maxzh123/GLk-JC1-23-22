package by.itAcademy.homeworks.arrays;

 /**    ## Задание 22
        > Создайте переменную для массива из 10 элементов. Заполните его
        > произвольными значениями целочисленного типа. Выведите на экран, переверните
        > и снова выведите на экран (при переворачивании нежелательно создавать еще один
        > массив).*/
import java.util.Arrays;

public class Task22 {
    private int[] array;

    public Task22(int[] array) {
        this.array = array;
    }

    public void getArray() {
        setArray(array);
    }

    public void setArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = array.length -1; i >-1; i--) {
            System.out.print(array[i]+" ");
        }
        this.array = array;
    }

    @Override
    public String toString() {
        return "Task22{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
