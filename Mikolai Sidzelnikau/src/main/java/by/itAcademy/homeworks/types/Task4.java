package by.itAcademy.homeworks.types;

/**
 * ## Задание 4
 * > Написать метод, который принимает на вход два целых числа, делает их
 * > суммирование и складывает результат с произведением двух этих чисел, и
 * > возвращает полученный результат из метода. Передать на вход в метод любые два
 * > числа. Вывести полученный результат работы метода на экран
 */
public class Task4 {
    public int getSumirovanie(int sum1, int sum2) {
        setSumirovanie(sum1, sum2);
        return sumirovanie;
    }

    public void setSumirovanie(int sum1, int sum2) {
        sum1 = (sum1 + sum2) + (sum1 * sum2);
        this.sumirovanie = sum1;
    }

    public int sumirovanie;
}
