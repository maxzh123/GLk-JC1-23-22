package by.itAcademy.homeworks.exceptions;

/**
 * > Написать метод, который будет возбуждать исключение и обработать это
 * > исключение на уровне выше. Результат работы программы вывести на экран.
 **/

public class Task45 {
    public static void main(String[] args) throws Exception{

        try {
            sumArray();
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    public static void sumArray () {

        int[] array = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < array.length + 1; i++) {
            System.out.println(array[i]);
        }
    }
}





