package by.itAcademy.homeworks.operators;

import java.util.Scanner;

//Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f. Проверить, помещаются ли эти дома на данном участке. Стороны домов – параллельны сторонам участка, в остальном размещение может быть любым.
public class Task10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        int e= sc.nextInt();
        int f= sc.nextInt();
        if (((a+c)<=e && (b+d)<=f) || ((a+d)<=e && (b+c)<=f) || ((a+c)<=f && (b+d)<=e) || ((a+d)<=f && (b+c)<=e)) {
            System.out.println("Поместится");
        }
        else {
            System.out.println("Не поместится");
        }
    }
}
