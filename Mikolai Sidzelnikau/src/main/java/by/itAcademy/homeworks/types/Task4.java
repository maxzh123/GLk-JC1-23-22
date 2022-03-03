package by.itAcademy.homeworks.types;
import java.util.Scanner;
/**## Задание 4
        > Написать метод, который принимает на вход два целых числа, делает их
        > суммирование и складывает результат с произведением двух этих чисел, и
        > возвращает полученный результат из метода. Передать на вход в метод любые два
        > числа. Вывести полученный результат работы метода на экран*/
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int r = scanner.nextInt();
        int sum1 = (s + r) + (s*r);
        System.out.println(sum1);
    }
}
