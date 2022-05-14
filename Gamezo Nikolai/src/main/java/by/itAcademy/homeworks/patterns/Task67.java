package by.itAcademy.homeworks.patterns;

/**
 * Задание 67
 * Создайте простейший сервис с методом, который выводит на экран текущую дату.
 * Сделайте его Singleton и используйте в основном телепрограммы.
 */

public class Task67 {
    public static void main(String[] args) {
        System.out.println("Текущая дата: " + SingletonTime.getDate().getCurrentDate());
    }
}
