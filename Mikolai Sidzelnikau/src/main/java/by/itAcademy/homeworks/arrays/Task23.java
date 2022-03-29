package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**## Задание 23
        > Создать двухмерный квадратный массив и заполнить его «бабочкой», то есть
        > таким образом:
        1 1 1 1 1
        0 1 1 1 0
        0 0 1 0 0
        0 1 1 1 0
        1 1 1 1 1 */

public class Task23 {

    private int[][] array;

    public Task23(int[][] array) {
        this.array = array;
    }

    public int[][] getArray() {
        setArray(array);
        return array;
    }

    private void setArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int sum = 1;
            for (int j = 0; j < array[i].length; j++) {
                array[0][j] = sum;
            }
            for (int j = 1; j < array[i].length-1; j++) {
                array[1][j] = sum;
            }
            for (int j = 2; j < array[i].length-2; j++) {
                array[2][j] = sum;
            }
            for (int j = 1; j < array[i].length-1; j++) {
                array[3][j] = sum;
            }
            for (int j = 0; j < array[i].length; j++) {
                array[4][j] = sum;
            }
            System.out.println(Arrays.toString(array[i]));
        }
        this.array = array;
    }

    @Override
    public String toString() {
        return "Task23{" +
                "array=" + Arrays.deepToString(array) +
                '}';
    }
}
