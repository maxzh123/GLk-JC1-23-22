package by.itAcademy.homeworks.operators;

/**
 * ## Задание 8
 * > Задать целое число в виде переменной, это число – сумма денег в рублях.
 * > Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже
 */

public class Task8 {
    public static void main(String[] args) {
        int rubles = 13;
        int check = rubles % 100;
        if (check == 0 || check > 4 && check < 19) {
            System.out.println(rubles + " рублей");
        }
        if (check == 1) {
            System.out.println(rubles + " рубль");
        }
        if (check == 2 || check == 3 || check == 4) {
            System.out.println(rubles + " рубля");
        }
    }
}
