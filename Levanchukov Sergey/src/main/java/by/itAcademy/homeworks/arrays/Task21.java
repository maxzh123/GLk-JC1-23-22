package by.itAcademy.homeworks.arrays;

/**
 * > Создайте переменную для массива из 10 элементов. Заполните его
 * > произвольными значениями целочисленного типа. Определите сумму элементов
 * > массива, расположенных между минимальным и максимальным значениями. Если
 * > значений максимальных и минимальных несколько, то необходимо взять
 * > максимальное значение разницы индексов между максимальным и минимальным
 * > значениями.
 **/

public class Task21 {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);/**Заполнение массива случайными числами до 100*/
            System.out.println("----" + array[i]+"----");
        }
        /**Инициализировли максимальное и минимальное значение для дальнейшего поиска*/
        int max=array[0];
        int min=array[0];

        /**Переменные для индекса максимального и минимального значения*/
        int indexMax=0;
        int indexMin=0;

        int sum=0;

        /**Производим поиск максимально значения*/
        for (int i=0;i< array.length;i++){/**Цикл для проверки всех элементов массива и нахождения большего из них */
            if (array[i]>max){
                max=array[i];
                indexMax=i;
            } else ;
        }

        /**Производим поиск минимального значения*/
        for (int i=0;i< array.length;i++){/**Цикл для проверки всех элементов массива и нахождения меньшего из них */
            if (array[i]<min){
                min=array[i];
                indexMin=i;
            } else ;
        }

       /* System.out.println(max+" "+indexMax); Проверка что выводит
        System.out.println(min+" "+indexMin);*/
        System.out.println("                                                      ");

        /**Проверяем какой индекс больше и суммируем массив между ними*/
        if (indexMin>indexMax){
            for(int i=indexMax;i<=indexMin;i++){
                sum=sum+array[i];
                System.out.println("----" + array[i]+"----"); //Проверка
            }
        }else {
            for (int i=indexMin;i<=indexMax;i++){
                sum=sum+array[i];
                System.out.println("----" + array[i]+"----"); //Проверка
            }
        }

        System.out.println("Максимальное значение массива: "+max);
        System.out.println("Минимальное значение массива: "+min);
        System.out.println("Сумма элементов между ними равно "+sum);

    }
}
