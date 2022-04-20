package by.itAcademy.homeworks.exceptions;

/**
 * Задание 45
 * Написать метод, который будет возбуждать исключение и обработать это исключение на уровне выше.
 * Результат работы программы вывести на экран.
 */

public class Task45 {
    public static void main(String[] args) {
        try {
            System.out.println(divisionByZero());
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
        System.out.println("Продолжает работать");
    }
    public static int divisionByZero() throws Exception {
        int result = 1 / 0;
        return result;
    }
}
