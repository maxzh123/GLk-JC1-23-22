package by.itAcademy.homeworks.patterns;

public class Task67 {

    /**Task67
     * Создайте простейший сервис с методом, который выводит на экран текущую дату.
     * Сделайте его Singleton и используйте в основном телепрограммы.
     */
    public static void main(String[] args) {
        System.out.println(MySingleton.getExample().getLd());
    }
}
