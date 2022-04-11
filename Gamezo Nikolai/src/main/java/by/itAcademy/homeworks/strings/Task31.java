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
        System.out.println("Время затраченное на сложение строк: " + sumString(str) + " мс");
        System.out.println("Время затраченное с использованием StringBuilder: " + sumStringBuilder(str) + " мс");
    }
    public static long sumString(String str) {
        long time = System.currentTimeMillis();
        String s = str;
        for (int i = 0; i < 100000; i++) {
            s = s + str;
        }
        return (System.currentTimeMillis() - time);
    }
    public static long sumStringBuilder(String str) {
        long time = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < 10000000; i++) {
            sb.append(str);
        }
//        sb.toString();
        return (System.currentTimeMillis() - time);
    }
}

