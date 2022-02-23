package by.itAcademy.homeworks.types;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(mul(sc.nextInt(), sc.nextInt()));
    }
    public static int mul(int a, int b){
        int s = 0;
        s += a+b;
        s += a*b;
        return s;
    }
}

