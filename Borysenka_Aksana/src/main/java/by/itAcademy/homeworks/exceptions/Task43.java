package by.itAcademy.homeworks.exceptions;

public class Task43 {

    /**Task43
     * Написать код, который выбрасывает NullPointerException.
     * Написать обработчик этого исключения и вывести на экран сообщение, которое будет содержать описание данного исключения.
     */

    public static void main(String[] args) {
        Integer x = null;

        try {
            int [] arr = new int[x];
        }
        catch (NullPointerException e){
            System.out.println("Инициализируй переменную нормально!");
        }
        finally {
            System.out.println("Это конец");
        }
    }
}
