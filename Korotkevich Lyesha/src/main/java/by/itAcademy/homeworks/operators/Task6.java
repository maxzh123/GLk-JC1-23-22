package by.itAcademy.homeworks.operators;

/**Создайте метод с одним целочисленным параметром.
 Метод должен определить, является ли последняя цифра числа семеркой и вернуть boolean значение.
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(isLastDigitSeven(67));
    }

    public static boolean isLastDigitSeven(int num) {
        boolean b = num % 10 == 7;
        return b;
    }
}

