package by.itAcademy.homeworks.operators;

/**Task 7
 * Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
 * Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число).
 */

// Ввод данных с консоли
import java.util.Scanner;

public class Task7 {
    public static void main (String[] arg) {

        Scanner in = new Scanner(System.in);

        //выводим приглашение к вводу ширины прямоугольника
        System.out.println("Enter the side width of the rectangle: ");
        // считываем введенное число int
        int width = in.nextInt();

        //выводим приглашение к вводу длинны прямоугольника
        System.out.println("Enter the side length of the rectangle: ");

        // считываем введенное число int
        int length = in.nextInt();

        //выводим приглашение к вводу радиуса круга
        System.out.println("Enter the radius of the circle: ");

        // считываем введенное число int
        int radius = in.nextInt();
        rezComparison(width, length, radius);
    }

    public  static void rezComparison(int w, int l, int r) {

        // определяем диагональ прямоугольника
        int diag = (int) Math.sqrt(w * w + l * l);

        if (r >= (diag / 2)) {
            System.out.println("Круглой картонкой радиусом = " + r + " можно закрыть прямоугольник со сторонами = " + w+ ", " + l);
        } else {
            System.out.println("Круглой картонкой радиусом = " + r + " нельзя закрыть прямоугольник со сторонами = " + w + ", " + l);
        }
    }

}

