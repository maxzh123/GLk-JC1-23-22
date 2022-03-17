package by.itAcademy.homeworks.loops;


/**
 * Задать произвольное число, вывести его в бухгалтерском формате.
 */

public class Task17 {
   public static void main(String[] args) {
        long value = 11000;
        String result = "";
        do {
            result = value % 1000 + " " + result;
            value = value / 1000;
        } while (value > 0);
        System.out.println(result);
    }
}
