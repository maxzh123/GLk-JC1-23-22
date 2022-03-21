package by.itAcademy.homeworks.operators;

/** Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
 *  Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число).
 */
public class Task7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int r = 2;
        if ((Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))) / 2 <= r) {
            System.out.println("Можно закрыть");
        } else {
            System.out.println("Нельзя закрыть");
        }
    }
}
