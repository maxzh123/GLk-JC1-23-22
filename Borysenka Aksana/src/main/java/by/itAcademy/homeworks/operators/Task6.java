package by.itAcademy.homeworks.operators;

/**Task6
 * Создайте метод с одним целочисленным параметром.
 * Метод должен определить, является ли последняя цифра числа семеркой и вернуть boolean значение.
 */

public class Task6 {


    public static void main(String[] arg) {
        int number = (int) (Math.random() * 100); // присваеваем переменной число, сгенерированное случайным образом, в диапозоне от 0 до 99
        checkNumber(number); //вызываем функцию, определенную ниже, которая принимает в себя одно целочисленное значение
    }

    /**
     * проверяем, заканчивается ли число на 7
     */
    private static void checkNumber(int number) {
        if (number % 10 == 7) {
            System.out.println("Число " + number + " заканчивается на 7");
        } else
            System.out.println("Число " + number + " не заканчивается на 7");
    }
}