package by.itAcademy.homeworks.types;

public class Task3 {
    public static void main(String[] args) {
        byte b = 0x55;
        short s = 0x55ff;
        int i = 1000000;
        long l = 0xffffffffL;
        char с = 'a' ;
        float f = .25f;
        double d = .00001234;
        boolean bool = true;
        System.out.format("Byte b is equal to %d; hex: %h\n",b,b);
        System.out.format("Short s is equal to %d; hex: %h\n",s,s);
        System.out.println("Integer i is equal to "+i);
        System.out.format("Long l is equal to %d; hex: %h\n",l,l);
        System.out.println("Char c is equal to "+с);
        System.out.println("Float f is equal to "+f);
        System.out.println("double d is equal to "+d);
        System.out.println("Boolean bool is equal to "+bool);
    }
}
