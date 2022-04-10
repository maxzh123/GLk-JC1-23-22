package by.itAcademy.homeworks.exceptions;

import java.util.Locale;

/**Написать код, который выбрасывает NullPointerException.
Написать обработчик этого исключения и вывести на экран сообщение, которое будет содержать описание данного исключения.*/

public class Task43 {
    public static void main(String[] args) {
        String[] values = new String[5];
        try {
            System.out.println(values[0].toUpperCase(Locale.ROOT));
        } catch (NullPointerException e){
            e.printStackTrace();
        } finally {
            System.out.println("Still working!");
        }
    }
}
