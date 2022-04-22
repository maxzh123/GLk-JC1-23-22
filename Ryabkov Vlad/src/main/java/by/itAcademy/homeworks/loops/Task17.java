package by.itAcademy.homeworks.loops;


/**
 * Задать произвольное число, вывести его в бухгалтерском формате.
 */

public class Task17 {
    public static void main(String[] args) {
        long value = 75652;
        addSpace(value);

    }

    public static String addSpace(long number) {
        String result = "";
        do {
            result = number % 1000 + " " + result;
            number = number / 1000;
        } while (number > 0);
        return result;
    }
}


