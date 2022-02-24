package by.itAcademy.homeworks.types;

import java.awt.peer.SystemTrayPeer;

public class Task3{
    public static void main(String[] args){
        byte b = 0x55;
        short s = 0x55ff;
        int i = 1000000;
        long l = 0xffffffffL;
        char c = 'a' ;
        float f = .25f;
        double d = .00001234;
        boolean bool = true;
        System.out.println(b+" "+s+" "+i+" "+l+" "+c+" "+f+" "+d+" "+bool+" ");
    }
}