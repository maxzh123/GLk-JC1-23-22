package by.itAcademy.homeworks.arrays;

/**Создайте переменную для массива из 10 элементов (другим способом).
 Заполните его произвольными значениями целочисленного типа и выведите на экран элементы, стоящие на четных позициях.*/

public class Task19 {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[10];
        even(fill(arr));
    }
    public static int[] fill(int array[]){
        for (int i=0; i<array.length;i++){
            array[i] = (int)(Math.random()*10+1);
        }
        return array;
    }
    public static void even(int array[]) {
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
}
