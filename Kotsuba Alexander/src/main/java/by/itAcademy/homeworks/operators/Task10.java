/*Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f.
Проверить, помещаются ли эти дома на данном участке.
Стороны домов – параллельны сторонам участка, в остальном размещение может быть любым.*/

package by.itAcademy.homeworks.operators;

import java.util.Scanner;

import static java.lang.Math.max;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону а: ");
        int a = sc.nextInt();
        System.out.println("Введите сторону b: ");
        int b = sc.nextInt();
        System.out.println("Введите сторону c: ");
        int c = sc.nextInt();
        System.out.println("Введите сторону d: ");
        int d = sc.nextInt();
        System.out.println("Определяем участок ");
        System.out.println("Введите e: ");
        int e = sc.nextInt();
        System.out.println("Введите f: ");
        int f = sc.nextInt();

        boolean inTheLine = (e > (a + c)) & (f > max(b,d));
        boolean aboveTheOther = (e > max(a,c)) & (f > (b + d));
        boolean isFit = inTheLine | aboveTheOther;
        if(isFit){
            System.out.println("Дома поместятся на участке");
        }else{
            System.out.println("Дома на участке не поместятся");
        }
    }
}
