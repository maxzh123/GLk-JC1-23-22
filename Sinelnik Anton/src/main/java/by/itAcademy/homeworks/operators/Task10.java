package by.itAcademy.homeworks.operators;

/** Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f.
 *  Проверить, помещаются ли эти дома на данном участке.
 *  Стороны домов – параллельны сторонам участка, в остальном размещение может быть любым.
 */
public class Task10 {
    public static void main(String[] args) {
        int a = 3, b = 8, c = 9, d = 7, e = 8, f = 5;
        if     ((a + c <= e) && (b + d <= f) ||
                (a + d <= e) && (b + c <= f) ||
                (b + c <= e) && (a + d <= f) ||
                (b + d <= e) && (a + c <= f)) {
            System.out.println("дома помещаются");
        } else {
            System.out.println("дома не помещаются");
        }
    }
}
