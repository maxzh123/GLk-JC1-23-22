package by.itAcademy.homeworks.types;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int r = scanner.nextInt();
        int sum = s*r;
        int sum1 = sum + s;
        int sum2 = sum + r;
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
