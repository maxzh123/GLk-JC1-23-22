package by.itAcademy.homeworks.arrays;
/**
 * > Создайте переменную для массива из 10 элементов. Заполните его
 * > произвольными значениями целочисленного типа. Найдите максимальный элемент
 * > и выведите его индекс.
 **/
public class Task20 {
    public static void main(String[] args) {
        int [] array=new int[10];
        for (int i=0;i< array.length;i++)
        {
            array[i]= (int) (Math.random()*10);/**Заполнение массива случайными числами до 9*/
            System.out.println("-----------------"+array[i]);
        }

        int max= array[0];
        for (int i=0;i< array.length;i++){/**Цикл для проверки всех элементов массива и нахождения большего из них */
            if (array[i]>max){
                max=array[i];
            } else ;
        }
        System.out.println("Максимальный элемент равен "+max);
    }
}
