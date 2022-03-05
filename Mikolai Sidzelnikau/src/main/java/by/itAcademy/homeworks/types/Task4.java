package by.itAcademy.homeworks.types;
import java.util.Scanner;
/**## Задание 4
        > Написать метод, который принимает на вход два целых числа, делает их
        > суммирование и складывает результат с произведением двух этих чисел, и
        > возвращает полученный результат из метода. Передать на вход в метод любые два
        > числа. Вывести полученный результат работы метода на экран*/
public class Task4 {
    public static int sumScanner;
    public static int sumScanner2;
    public static int k = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         sumScanner2 = scanner.nextInt();
         sumScanner = scanner.nextInt();
        System.out.println(sumirovanie(sumScanner, sumScanner2));

    }
    public static int sumirovanie(int sum2, int sum3){
         k = (sum2 + sum3) + (sum2*sum3);
        return k;
    }
}
