package by.itAcademy.homeworks.arrays;
//Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа. Найдите максимальный элемент и выведите его индекс.
public class Task20 {
    public static void main(String[] args) {
        int i;
        int array[]=new int[10];
        for (i=0;i<10;i++){
            array[i]=(int)(Math.random()*100);
        }
        int max=array[0];
        int max_index=0;
        for (i=1;i<10;i++){
            if (max<array[i]){
                max=array[i];
                max_index=i;
            }
        }
        System.out.println("Максимальный элемент "+max);
        System.out.println("Номер максимального элемента "+max_index);
    }
}
