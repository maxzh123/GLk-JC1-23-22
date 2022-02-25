package by.itAcademy.homeworks.operators;

import java.util.Scanner;

/**## Задание 10
        > Имеются два дома размерами a на b и c на d. Имеется участок размерами e на
        > f. Проверить, помещаются ли эти дома на данном участке. Стороны домов –
        > параллельны сторонам участка, в остальном размещение может быть любым.*/

public class Task10 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ширину первого дома");
        a = scanner.nextInt();
        System.out.println("Введите длину первого дома");
        b = scanner.nextInt();
        System.out.println("Введите ширину второго дома");
        c = scanner.nextInt();
        System.out.println("Введите длину второго дома");
        d = scanner.nextInt();
        System.out.println("Введите ширину  участка");
        e = scanner.nextInt();
        System.out.println("Введите длину участка");
        f = scanner.nextInt();
        int dom1 = a*b; //узнаем площать первого дома
        int dom2 = c*d; //узнаем площать второго дома
        int doma = dom1+dom2; //общая площать двух домов
        int region = e*f; //узнаем площадь участка
        if (region >= doma){
            int region1 = region - doma; //узнаем остаток площади
            System.out.println("Общая площать домов = "+ doma +" "+ " Площадь участка = " + region); //выводим значение домов и участка
            System.out.println("Вам хвотает устоновить дома и остаток площади = "+ region1);
        }else if(region < doma){
            int region2 = doma - region; //узнаем сколько не хватает площади
            System.out.println("Общая площать домов = "+ doma+"Площадь участка = "+region); //выводим значение домов и участка
            System.out.println("Вам не хватает площади = "+region2);
        }
    }
}
