package by.itAcademy.homeworks.strings;

import by.itAcademy.homeworks.utils.Printer;

/**
 * Задание 31
 * Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”, один с помощью оператора сложения и String,
 * другой с помощью StringBuilder и метода append. Сравните скорость их выполнения. Выведите сравнение на экран.
 */

public class Task31 {
    public static void main(String[] args) {
        String string = "aaabbbccc";
        Printer.print("Время выполнения " + getExecutionTimeString(string) + " мс");
        Printer.print("Время выполнения " + getExecutionTimeStringBuilder(string)+ " мс");

    }

    public static long getExecutionTimeString(String string) {
        String str = string;
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str = str + string;
        }
        return (System.currentTimeMillis() - time);
    }

    public static long getExecutionTimeStringBuilder(String string) {
        long time = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(string);
        for (int i = 0; i < 10000; i++) {
            sb.append(string);
        }
        sb.toString();
        return (System.currentTimeMillis() - time);
    }
}

