package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task10 {
    /**
     * Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f.
     * Проверить, помещаются ли эти дома на данном участке.
     * Стороны домов – параллельны сторонам участка, в остальном размещение может быть любым.
     */

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side A house1: ");
        int  sideAhouse1= in.nextInt();
        System.out.println("Enter the side B house1: ");
        int  sideBhouse1= in.nextInt();
        System.out.println("Enter the side C house2: ");
        int  sideChouse2= in.nextInt();
        System.out.println("Enter the side D house2: ");
        int  sideDhouse2= in.nextInt();
        System.out.println("Enter the side E area: ");
        int  sideEarea= in.nextInt();
        System.out.println("Enter the side F area: ");
        int  sideFarea= in.nextInt();
        System.out.println(checkFitIn(sideAhouse1, sideBhouse1, sideChouse2, sideDhouse2, sideEarea, sideFarea));
    }

    public static String checkFitIn(int a, int b, int c, int d, int e, int f){
    if (a>0 && b>0 && c>0 && d>0 && e>0 && f >0){
        if (a<b) {
            return aLessThanb(a, b, c, d, e, f);
        } else {
            return aMoreb(a, b, c, d, e, f);
        }
    } else
        return "Erorr: enter correct Number";
    }

    public static String aLessThanb(int a, int b, int c, int d, int e, int f){
    if (e>d && e>a && f>(b+c)){
    } if (e>(a+c) && f>b && f>c) {
        } if (e>a && e>c && f>(b+d)) {
            } if (e>(a+c) && f>b && f>d){
        return "Both houses will fit on the plot";
    } else
    return "Both houses will not fit on the plot";
    }

public static String aMoreb(int a, int b, int c, int d, int e, int f){
    if (e>b && e>d && f>(a+c)) {
        } if (e>b && e>c && f> (a+d)){
            } if (e>(b+d) && f>a && f>c){
                } if (e>(b+c) && f>a && f>d){
        return "Both houses will fit on the plot";
    } else
    return "Both houses will not fit on the plot";
}

}


