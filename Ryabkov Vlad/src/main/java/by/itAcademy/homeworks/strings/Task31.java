package by.itAcademy.homeworks.strings;

/**
 * Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”,
 * > один с помощью оператора сложения и String, а другой с помощью StringBuilder и
 * > метода append. Сравните скорость их выполнения. Выведите сравнение на экран.
 */

public class Task31 {
    public static void main(String[] args) {
        String str = " ";
        long time = System.currentTimeMillis();

    }
    public static StringBuilder strBuilder(){
        StringBuilder stringBuilder = new StringBuilder();
        for (long i = 0; i <1_000_000 ; i++) {
            stringBuilder.append("aaabbbccc");

        }return stringBuilder;
    }

    public static void addString(String str){
        for (long i = 0; i <1_000_000 ; i++) {
            str+="aaabbbccc";

        }
    }
}
