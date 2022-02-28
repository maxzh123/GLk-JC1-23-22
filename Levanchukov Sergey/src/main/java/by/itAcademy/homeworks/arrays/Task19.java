package by.itAcademy.homeworks.arrays;
/**
 * > Создайте переменную для массива из 10 элементов (другим способом).
 * > Заполните его произвольными значениями целочисленного типа и выведите на
 * > экран элементы, стоящие на четных позициях.
 **/
public class Task19 {
    public static void main(String[] args) {
        int [] array=new int[10];
        for (int i=0;i<10;i++)
        {
            array[i]= (int) (Math.random()*10);/**Заполнение массива случайными числами до 9*/
            System.out.println("-------------"+array[i]);
        }
        System.out.println("Последний элемент "+array[10-1]);/**Вывод последнего элемента массива*/
    }
}

