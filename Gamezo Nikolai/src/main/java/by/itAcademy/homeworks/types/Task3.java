package by.itAcademy.homeworks.types;

/** Задание 3
    Написать код, который выведет значения переменных на экран:

        byte b = 0х55;
        short s = 0x55ff;
        int i = 1000000;
        long l = 0xffffffffL;
        char с = 'a' ;
        float f = .25f;
        double d = .00001234;
        boolean bool = true;
*/
public class Task3 {
    public static void main (String[] arg) {
        byte b = 0x55;
        short s = 0x55ff;
        int i = 1000000;
        long l = 0xffffffffL;
        char c = 'a';
        float f = .25f;
        double d = .00001234;
        boolean bool = true;
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("c = " + c);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("bool = " + bool);
    }
}
