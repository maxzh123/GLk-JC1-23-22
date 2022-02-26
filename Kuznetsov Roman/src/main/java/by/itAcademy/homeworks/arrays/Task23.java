package by.itAcademy.homeworks.arrays;

/**
 * Класс для создания двухмерного массива в виде бабочки.
 */
public class Task23 {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int[][] array = new int[ARRAY_LENGTH][ARRAY_LENGTH];
        //Выводим верхнюю половину половину массива
        for (int i = 0; i < array.length/2; i++) {
            for (int j = 0; j < array.length; j++) {
                if(j>=i&&j<array.length-i)
                    array[i][j] = 1;
                else
                    array[i][j] = 0;
            }
        }
        //Выводим нижнюю половину массива
        for (int i = array.length-1; i >= array.length/2; i--) {
            for (int j = 0; j < array.length; j++) {
                if ((j < (array[i].length - 1 - i)) || (j > i))
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
            }
        }
            //вывод массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
