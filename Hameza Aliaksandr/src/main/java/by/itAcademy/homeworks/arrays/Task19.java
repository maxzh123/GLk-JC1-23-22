package by.itAcademy.homeworks.arrays;
/**
 * Задание 19
 * Создайте переменную для массива из 10 элементов (другим способом).
 * Заполните его произвольными значениями целочисленного типа и выведите на экран элементы, стоящие на четных позициях.
 */
public class Task19 {
    public static void main(String[] args) {
        int array[] = new int[10];
        findEvenNum(randomArray(array));
    }
    public static int[] randomArray(int array[]){
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 10+1);
            }
            return array;
        }
            public static void findEvenNum(int[] array){
                for (int i = 0; i < array.length; i+=2){
                    System.out.print(array[i]);
                }
            }
}
