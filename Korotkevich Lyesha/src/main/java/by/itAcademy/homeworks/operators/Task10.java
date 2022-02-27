package by.itAcademy.homeworks.operators;
import java.util.Scanner;
/**Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f. Проверить, помещаются ли эти дома на данном участке.
        Стороны домов – параллельны сторонам участка, в остальном размещение может быть любым.*/
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e, f;
        System.out.println("Введите ширину первого дома:");
        a = sc.nextInt();
        System.out.println("Введите длину первого дома:");
        b = sc.nextInt();
        System.out.println("Введите ширину второго дома:");
        c = sc.nextInt();
        System.out.println("Введите длину второго дома:");
        d = sc.nextInt();
        System.out.println("Введите ширину участка:");
        e = sc.nextInt();
        System.out.println("Введите длину участка:");
        f = sc.nextInt();
        if ((b+d <= f && Math.max(a, c) <= e) || (a+c <= e && Math.max(b, d) <= f)){
            System.out.println("Дома помещаются на данном участке");
        }else{
            System.out.println("Дома не помещаются на данном участке");
        }

    }
}
