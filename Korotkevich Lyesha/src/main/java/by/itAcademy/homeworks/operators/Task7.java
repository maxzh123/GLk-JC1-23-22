package by.itAcademy.homeworks.operators;
import java.util.Scanner;

/**Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число).
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r = sc.nextInt();
        if (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) <= 2*r) {
            System.out.println("Можно полностью закрыть");
        } else{
            System.out.println("Нельзя");
        }
    }
}
