package by.itAcademy.homeworks.exceptions;

//Написать метод, который будет возбуждать исключение и обработать это исключение на уровне выше.
//Результат работы программы вывести на экран.

public class Task45 {
    public static void main(String[] args) {
        int[] array=new int[3];
        try{
            array[4]=5;
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("работает");
    }
}
