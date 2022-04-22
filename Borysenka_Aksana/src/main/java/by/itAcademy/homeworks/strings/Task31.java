package by.itAcademy.homeworks.strings;

public class Task31 {

    /**Task31
     * Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”, один с помощью оператора сложения и String,
     * а другой с помощью StringBuilder и метода append. Сравните скорость их выполнения. Выведите сравнение на экран.
     */

    public static void main(String[] args) {
        String str = "aaabbbccc";
        System.out.println(getResultConcatMethod(str));
        System.out.println(getResultBuilderMethod(str));
    }

    public static long getResultConcatMethod(String str){
        long time = System.currentTimeMillis();
        String s = str;
        for (int i = 0; i < 100000; i++){
            s = s + str;
        }
        return (System.currentTimeMillis() - time);
    }

    public static long getResultBuilderMethod(String str){
        long time = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < 100000; i++){
            sb.append(str);
        }
        sb.toString();
        return (System.currentTimeMillis() - time);
    }

}
