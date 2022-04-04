package by.itAcademy.homeworks.exceptions;

public class Task45 {

    /**Task45
     * Написать метод, который будет возбуждать исключение и обработать это исключение на уровне выше.
     * Результат работы программы вывести на экран.
     */

    public static void main(String[] args) {
        int a = 2;
        int b = 0;

        try{
            System.out.println(a/b);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
