package by.itAcademy.homeworks.operators;
/**
 * Задание 10
 * Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f. Проверить, помещаются ли эти дома на данном участке.
 * Стороны домов – параллельны сторонам участка, в остальном размещение может быть любым.
 */

public class Task10 {
    public static void main(String[] args) {
        System.out.println(houses(5, 6,2,3,4,5));
    }
        public static String houses(int a, int b, int c, int d, int e, int f) {
            String str = "";
            if ((b + c <= f && a <= e && d <= e) || (b + d <= f && a <= e && c <= e) || (a + d <= f && b <= e && c <= e) || (a + c <= f && b <= e && d <= e) ||
                    (a + c <= e && b <= f && d <= f) || (a + d <= e && b <= f && c <= f) || (b + c <= e && a <= f && d <= f) || (b + d <= e && a <= e && c <= e)) {
                str = "Дома можно вместить на участок";
            } else {
                str = "Дома нельзя поместить на участок";
            }
            return str;
        }

}
