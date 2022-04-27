package by.itAcademy.homeworks.strings;

//Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”,
// один с помощью оператора сложения и String, а другой с помощью StringBuilder и метода append.
// Сравните скорость их выполнения. Выведите сравнение на экран.

public class Task31 {
    public static void main(String[] args) {
        String s="aaabbbccc";
        System.out.println(getseclong(s));
        System.out.println(getstringbuilder(s));
    }

    public static long getseclong(String s){
        long time1=System.currentTimeMillis();
        String s1="";
        for (int i=0;i<=1_000_000;i++){
            s1+=s;
        }
        return (System.currentTimeMillis() - time1);
    }

    public static long getstringbuilder(String s){
        long time2=System.currentTimeMillis();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<=1_000_000;i++){
            sb.append(s);
        }
        return (System.currentTimeMillis() - time2);
    }
}
