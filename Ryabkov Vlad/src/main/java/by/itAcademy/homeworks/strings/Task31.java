package by.itAcademy.homeworks.strings;

/**
 * Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”,
 * > один с помощью оператора сложения и String, а другой с помощью StringBuilder и
 * > метода append. Сравните скорость их выполнения. Выведите сравнение на экран.
 */

public class Task31 {
    public static void main(String[] args) {
        String str = " ";
        BuilderTimeTest(str);
        System.gc();
        addStringTimeTest(str);
        System.gc();


    }

    public static StringBuilder strBuilder(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (long i = 0; i < 10_000; i++) {
            stringBuilder.append("aaabbbccc");

        }
        return stringBuilder;
    }

    public static void addString(String str) {
        for (long i = 0; i < 10_000; i++) {
            str += "aaabbbccc";
        }
    }

    public static void BuilderTimeTest(String str) {
        long timeStart = System.currentTimeMillis();
        strBuilder(str);
        long timeFinish = System.currentTimeMillis();
        long totalTime = timeFinish - timeStart;
        System.out.println("Заняло времени с использованием StringBuilder: " + totalTime + "ms");
    }

    public static void addStringTimeTest(String str) {
        long timeStart = System.currentTimeMillis();
        addString(str);
        long timeFinish = System.currentTimeMillis();
        long totalTime = timeFinish - timeStart;
        System.out.println("Конкантинация заняла времени: "+ totalTime + "ms");
    }
}
