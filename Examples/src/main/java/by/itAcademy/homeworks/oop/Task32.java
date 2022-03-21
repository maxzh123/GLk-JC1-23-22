package by.itAcademy.homeworks.oop;

import java.math.BigInteger;

public class Task32 {
    public static void main(String[] args) {
        print("3333",8);
    }

    public static void print(String str,int i) {
        System.out.printf("Вы печатаете строку %s и число %d\n",str,i);
    }

    public int print(String str) {
        System.out.println("строка: "+str);
        return 0;
    }

    public boolean print(int a) {
        System.out.println(a);
        return false;
    }

    public static void print(boolean bool) {
        System.out.println(bool);
    }
    public static void print(BigInteger b) {
        System.out.println(b);
    }
    public static void print(Object obj) {
        System.out.println(obj);
    }


}
