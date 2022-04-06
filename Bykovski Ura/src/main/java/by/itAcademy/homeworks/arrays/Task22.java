package by.itAcademy.homeworks.arrays;
//Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
// Выведите на экран, переверните и снова выведите на экран (при переворачивании нежелательно создавать еще один массив).
public class Task22 {
    public static void main(String[] args) {
        int array[]=new int[10];
        int i;
        for (i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100);
        }
        for (i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println();
        for (i=array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }
    }
}
