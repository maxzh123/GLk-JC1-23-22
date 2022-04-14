package by.itAcademy.homeworks.exceptions;

/**
 * Написать код, который выбрасывает NullPointerException. Написать обработчик
 * этого исключения и вывести на экран сообщение, которое будет содержать описание
 * данного исключения.
 */
public class Task43 {
    public static void main(String[] args) {
        Object object = null;
        exeption(object);
    }
    public static void exeption (Object o){
        try {
            o.toString();
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Ошибка. Нельзя объект приобразовать в строку!");

        }
    }
}
