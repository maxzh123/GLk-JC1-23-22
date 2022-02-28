package by.itAcademy.homeworks.loops;

/**
 * ## Задание 16
 * > Для целых чисел, которые делятся на 7 в диапазоне от 1 до 100, вывести на
 * > экран строку “Hope!”.
 */
public class Task16 {
    public static void main(String[] args) {
        int[] sum = new int[100];
        String r = "Hope!";
        int sum1 = 0;
        for (int s = 0; s < sum.length; s++) {
            sum[s] = s + 1;
            sum1 = sum[s];
            while (sum1 % 7 == 0) {
                System.out.println(sum1 + " " + r); // вывел числа которые длятся на 7
                break;
            }
            System.out.println(sum1); // вывел все числа
        }
    }
}
