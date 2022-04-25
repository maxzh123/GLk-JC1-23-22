package by.itAcademy.homeworks.operators;
/**
 *  Имеются два дома размерами a на b и c на d. Имеется участок размерами e на
 *  f. Проверить, помещаются ли эти дома на данном участке. Стороны домов –
 *  параллельны сторонам участка, в остальном размещение может быть любым.
 */

public class Task10 {
    public static void main(String[] args) {

       int e = 16, f = 16, a = 6, b = 6, c = 3, d = 2;

        if ((e >= (a + c)) && (f >= b && f >= d)) {
            System.out.println(" Можно построить 2 дома");
        } else if ((e >= (a + d)) && (f >= b && f >= c)) {
            System.out.println(" Можно построить 2 дома");
        } else if ((e >= (b + c)) && (f >= a && f >= d)) {
            System.out.println(" Можно построить 2 дома");
        } else if ((e >= (b + d)) && (f >= a && f >= c)) {
            System.out.println(" Можно построить 2 дома");
        } else if ((f >= (a + c)) && (e >= b && e >= d)) {
            System.out.println(" Можно построить 2 дома");
        } else if ((f >= (a + d)) && (e >= b && e >= c)) {
            System.out.println(" Можно построить 2 дома");
        } else if ((f >= (b + c)) && (e >= a && e >= d)) {
            System.out.println(" Можно построить 2 дома");
        } else if ((f >= (b + d)) && (e >= a && e >= c)) {
            System.out.println(" Можно построить 2 дома");
        }
        else
            System.out.println("Нельзя построить 2 дома");
    }
}
