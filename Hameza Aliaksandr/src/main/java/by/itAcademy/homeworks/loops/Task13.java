package by.itAcademy.homeworks.loops;
/**
 * Задание 13
 * Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
 */
public class Task13 {
    public static void main(String[] args) {
        int a = 1;
        double res = 1;
        System.out.println(res);
        do {
            res= res * a;
            a++;
        }while(a<=25);
        System.out.println(res);
    }
}
