package by.itAcademy.homeworks.loops;

public class MathEquation {

    /**
     * факториал числа
     */
    public static int sum1 = 1;

    public static int factorial(int sum) {
        while (sum == sum1) {
            return sum1;
        }
        return sum * factorial(sum - sum1);
    }
}
