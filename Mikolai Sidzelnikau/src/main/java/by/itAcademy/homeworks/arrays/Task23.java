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
    private int sum1 = 10;
    private int sum2 = 10;
    private int[][] array = new int[sum1][sum2];
    private int sum = 1;

    public int[][] getArray() {
        setArray();
        return array;
    }

    private void setArray() {
        int js = 0;
        int ks = sum1%2;
        for (int i = 0; i < sum1; i++) {
            if (js==sum2){
                js--;
                sum2++;
            }
            for (int j = js; j < sum2; j++) {
                array[i][j] = sum;
            }if(i<sum1/2) {
                js++;
                sum2 = sum2 - 1;
            }else{
                js--;
                sum2++;
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }
    @Override
    public String toString() {
        return "Task23{" +
                "array=" + Arrays.deepToString(array) +
                '}';
    }
}
