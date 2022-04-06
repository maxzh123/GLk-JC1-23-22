package by.itAcademy.homeworks.exceptions;

/**
 * > Написать код, который выбрасывает NullPointerException. Написать обработчик
 * > этого исключения и вывести на экран сообщение, которое будет содержать описание
 * > данного исключения.
 */

public class Task43 {
    public static void main(String[] args) {
        String a = null;
        try {
            a.lastIndexOf(a);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Попытка вызвать метод у null");
        }
    }

}
