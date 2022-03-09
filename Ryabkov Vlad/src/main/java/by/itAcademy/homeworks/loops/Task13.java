package by.itAcademy.homeworks.loops;

/**
 * ## Задание 13
 * > Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
 */

public class Task13 {
    public static void main(String[] args) {
        int value = 25;
        int product = multipler(value);
        System.out.println(product);
    }

    public static int multipler (int value){
        int product = 1;
        int i = 1;
            do {
                product *=i;
            i++;
        } while (i <= value);
            return product;
    }
}
