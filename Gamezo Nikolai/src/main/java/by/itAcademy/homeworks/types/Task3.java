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

        //Выводится всё одной командой, каждая переменная с новой строки
        System.out.println("b=" + b + "\n" + "s=" + s + "\n" + "i=" + i + "\n" + "l=" + l + "\n" + "c=" + c + "\n" + "f=" + f + "\n" + "d=" + d + "\n" + "bool=" + bool);
    }
}
