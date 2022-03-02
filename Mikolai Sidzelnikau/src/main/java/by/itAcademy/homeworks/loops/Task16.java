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
        int s = 0;
        while (s < sum.length){
            sum[s] = s +1;
            if (sum[s] % 7==0){
                System.out.println(sum[s]+" " + r);
            }
            s++;
        }
    }
}
