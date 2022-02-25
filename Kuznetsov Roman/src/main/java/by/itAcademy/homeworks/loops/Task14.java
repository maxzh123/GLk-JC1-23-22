package by.itAcademy.homeworks.loops;

import java.util.Scanner;

/**
 * Используя цикл do-while суммировать все цифры числа.
 *
 */
public class Task14 {
    public static void main(String[] args) {
        int i=0; int result = 0;
        Scanner scanner = new Scanner(System.in);
        char[] number = scanner.nextLine().toCharArray(); // разлаживаем нужное число в массив символов.
        do{
            result+=Integer.parseInt(String.valueOf(number[i])); // преобразуем один элемент char в int и суммируем
            i++;
        }while(i<number.length);
        System.out.println(result);
    }
}
