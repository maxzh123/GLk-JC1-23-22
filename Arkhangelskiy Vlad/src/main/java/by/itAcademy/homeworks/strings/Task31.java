package by.itAcademy.homeworks.strings;

/**
 * Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”,
 * один с помощью оператора сложения и String, а другой с помощью StringBuilder и метода append.
 * Сравните скорость их выполнения. Выведите сравнение на экран.
 */

public class Task31 {
    public static void main(String[] args) {

        String str = "aaabbccc";
        System.out.println(createStringAsBuilder(str));
        System.out.println(createStringAsString(str));
    }

    public static long createStringAsBuilder(String str) {

        final long startTime = System.nanoTime();

        StringBuilder result = new StringBuilder(str);
        for (int i = 0; i <= 1000000; i++) {
            result.append(str);
        }
        result.toString();

        return (System.nanoTime() - startTime);

    }

    public static long createStringAsString(String str) {

        final long startTime = System.nanoTime();

        String s = str;
        for (int i = 0; i < 10000; i++) {
            s = s + str;
        }

        return (System.nanoTime() - startTime);
    }
}