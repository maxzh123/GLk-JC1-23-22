package by.itAcademy.homeworks.operators;

/**
 * ## Задание 6
 * > Создайте метод с одним целочисленным параметром. Метод должен
 * > определить, является ли последняя цифра числа семеркой и вернуть boolean
 * > значение.
 */
public class Task6 {
    public static void main(String[] args) {
        numbers(237);
    }

    public static int numbers(int sum) {
        int sum1 = sum % 10;
        boolean b;
        if (sum1 != 7) {
            System.out.println(b = false);
        } else {
            System.out.println(b = true);
        }
        return sum;
    }
}
