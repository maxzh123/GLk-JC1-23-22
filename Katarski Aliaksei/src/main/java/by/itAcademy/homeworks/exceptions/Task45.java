package by.itAcademy.homeworks.exceptions;

/**
 * Написать метод, который будет возбуждать исключение и обработать это
 * > исключение на уровне выше. Результат работы программы вывести на экран.
 */

public class Task45 {
    public static void main(String[] args) {
//      int [] arr=new int[5];
        int [] arr=null;
        try {
            arr[6]=1;
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("массив был null");
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("вышел за границу массива");
        }
    }

}
