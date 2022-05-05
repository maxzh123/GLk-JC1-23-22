package by.itAcademy.homeworks.patterns;


import java.util.concurrent.TimeUnit;

/**Создайте простейший сервис с методом, который выводит на экран текущую дату.
 * Сделайте его Singleton и используйте в основном телепрограммы.
 */

public class Task67 {
    public static void main(String[] args) {
        System.out.println(SingletonTime.getDate().getCurrentDate());
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(5));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(SingletonTime.getDate().getCurrentDate());
    }

}
