/*Написать метод, который будет возбуждать исключение и обработать это исключение на уровне выше.
Результат работы программы вывести на экран.*/

package by.itAcademy.homeworks.exceptions;

public class Task45 {
    public static void main(String[] args) {
        int x = 20;
        int z = 0;
        try {
            System.out.println(x/z);
        }catch (Exception e){
            System.err.println("деление на 0");
        }
    }
}
