package by.itAcademy.homeworks.operators;

/**
 *  Имеются два дома размерами a на b и c на d. Имеется участок размерами e на
 *  f. Проверить, помещаются ли эти дома на данном участке. Стороны домов –
 *  параллельны сторонам участка, в остальном размещение может быть любым.
 */

public class Task10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c = 6;
        int d = 9;
        int e = 9;
        int f = 10;
        int areaOfHouse1 = a * b;
        int areaOfHouse2 = c * d;
        int areaOfLand = e * f;
        if (areaOfHouse1+areaOfHouse2 > areaOfLand){
            System.out.println("Нельзя поместить");
        }else System.out.println("Можно поместить");

    }
}
