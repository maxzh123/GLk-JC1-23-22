package by.itAcademy.homeworks.strings;

/**
 * > Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”,
 * > один с помощью оператора сложения и String, а другой с помощью StringBuilder и
 * > метода append. Сравните скорость их выполнения. Выведите сравнение на экран.
 **/

public class Task31 {
    public static void main(String[] args) {
        System.out.println(theFirstMerhod()+"ms");
        System.out.println(theSecondMethod()+"ms");
    }
    /**Метод возвращает время за которое выполниться сложение строк типа String*/
    public static long theFirstMerhod (){
        String s="aaabbbccc";
        long time=System.currentTimeMillis();
        for (int i=0;i<10000;i++){
            s=s+"aaabbbccc";
        }
        System.gc();
        return (System.currentTimeMillis()-time);
        }
    /**Метод возвращает время за которое выполниться сложение строк типа StringBuilder*/
    public static long theSecondMethod(){
        long time= System.currentTimeMillis();
        StringBuilder sb=new StringBuilder("aaabbbccc");
        for(int i=0;i<1000000;i++){
            sb.append("aaabbbccc");
        }
        sb.toString();
        return (System.currentTimeMillis()-time);
    }
}
