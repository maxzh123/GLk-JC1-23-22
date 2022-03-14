package by.itAcademy.homeworks.operators;
//Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа. Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число).

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r = sc.nextInt();
        if (r*r>=a*a+b*b)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
