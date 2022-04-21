package by.itAcademy.homeworks.strings;

/**
 * Задание 31
 * Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”,
 * один с помощью оператора сложения и String, а другой с помощью StringBuilder и метода append.
 * Сравните скорость их выполнения. Выведите сравнение на экран.
 */

public class Task31 {
    public static void main(String[] args) {
        String str = "aaabbbccc";
        System.out.println("Время StringBuilder: " + sumStringBuilder(str) + "ms");
        System.out.println("Время String: " + sumString(str) + "ms");

    }

    public static long sumString(String str) {
        long timeStart = System.currentTimeMillis();
        String res = "";
        String text = str;
        for (int i = 0; i < 100000; i++) {
            res += str;
        }
        return System.currentTimeMillis() - timeStart;

    }

    public static long sumStringBuilder(String str) {
        long timeStart = System.currentTimeMillis();
        StringBuilder res = new StringBuilder();
        String text = str;
        for (int i = 0; i < 100000; i++) {
            res.append(text);
        }
        return System.currentTimeMillis() - timeStart;
    }
}
