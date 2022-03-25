package by.itAcademy.homeworks.loops;


/**
 * Задать произвольное число, вывести его в бухгалтерском формате.
 */

public class Task17 {
    public static void main(String[] args) {
        long value = 75652;
        addSpace(value);

    }

    static void addSpace(long value) {
        StringBuffer str = new StringBuffer(Long.toString(value));
        int i = str.length();
        for (int j = i / 3 +1; j > 0; j--) {
            str.insert(i, " ");
            i -= 3;
        }
        System.out.println(str);
    }
}


