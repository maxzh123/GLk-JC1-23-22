package by.itAcademy.homeworks.operators;

/**
 *  Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
 *  Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число). *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите длину прямоугольника");
        String a = reader.readLine();
        int length = Integer.parseInt(a);

        System.out.println("ВВедите ширину треугольника");
        String b = reader.readLine();
        int width = Integer.parseInt(b);

        System.out.println("Введите радиус круга");
        String c = reader.readLine();
        int r = Integer.parseInt(c);
        compare(length, width, r);


    }

    private static void compare(int length, int width, int r) {
        if(r*2 >= (int) Math.sqrt(width * width + length * length)){
        System.out.println("Закрывает");

    }else {
        System.out.println("Не закрывает");
    }


}
}
