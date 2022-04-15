package by.itAcademy.homeworks.exceptions;

/**
 * Задание 43
 * Написать код, который выбрасывает NullPointerException.
 * Написать обработчик этого исключения и вывести на экран сообщение, которое будет содержать описание данного исключения.
 */

public class Task43 {
    public static void main(String[] args) {
        Integer num = null;
        try {
            int x = num * 2;
        } catch (NullPointerException exc) {
            System.out.println("На null умножать нельзя");
            //Это необязательно
            exc.printStackTrace();
        } finally {
            System.out.println("Это тоже необязательно");
        }
        System.out.println("Продолжает работать");
    }
}
