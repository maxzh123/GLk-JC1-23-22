package by.itAcademy.homeworks.arrays;

/**
 * ## Задание 19
 * > Создайте переменную для массива из 10 элементов (другим способом).
 * > Заполните его произвольными значениями целочисленного типа и выведите на
 * > экран элементы, стоящие на четных позициях.
 */
public class Task19 {
    public static void main(String[] args) {
        int[] array = {67870, 101146, 9498, 61138, 156873, 124098, 8505, 10184, 171916, 57102};
        arrays(array);
    }

    public static int[] arrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
        return arr;
    }
}
