package by.itAcademy.homeworks.operators;

/**
 * ## Задание 7
 * > Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
 * > Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже
 * > целое число).
 */

public class Task7 {
    public static void main(String[] args) {
        comparison(7,4,55);


    }
    public static void comparison (int a, int b, int r){
        int perimetr = a * b;
        int diametr = r * 2;
        if (perimetr > diametr){
            System.out.println("Не закроет отверстие");
        }else
            System.out.println("Закроет отверстие");
        return;
    }
}
