package by.itAcademy.homeworks.arrays;
/**Создайте переменную для массива из 10 элементов (другим способом).
        > Заполните его произвольными значениями целочисленного типа и выведите на
        > экран элементы, стоящие на четных позициях.*/
public class Task19 {
    public static void main(String[] args) {
    int [] array = {1,2,3,4,5,6,7,8,9,10,11};
    for (int i=2; i< array.length; i+=2)
        {
        System.out.println("Четные позиции массива: " + array [i]);
        }
    }
}
