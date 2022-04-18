/*Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”,
один с помощью оператора сложения и String, а другой с помощью StringBuilder и метода append.
Сравните скорость их выполнения. Выведите сравнение на экран.*/
package by.itAcademy.homeworks.strings;

public class Task31 {
    public static void main(String[] args) {
        String text = "aaabbbccc";
        final int repit = 1000000;
        System.out.println("Время StringBuilder: " + StringBuilderTime(text,repit) + "ms");
        System.out.println("Время String: " + StringTime(text,repit) + "ms");
    }

    static long StringTime(String str,int rep){
        String res = "";
        String text = str;
        System.gc();
        long start = System.currentTimeMillis();
        for(int i = 0;i<rep;i++){
            res+=str;
        }
        return System.currentTimeMillis() - start;
    }

    static long StringBuilderTime(String str,int rep){
        StringBuilder res = new StringBuilder();
        String text = str;
        System.gc();
        long start = System.currentTimeMillis();

        for(int i = 0;i<rep;i++){
            res.append(text);
        }
        return System.currentTimeMillis() - start;

    }
}
