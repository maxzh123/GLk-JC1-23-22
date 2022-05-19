package by.itAcademy.homeworks.FinalTasks;

/**
 * 1.Сгенерировать три произвольных целых числа X, Y и Z.
 * Если X больше Z, то вывести на экран сумму X и Y, иначе вывести на экран значение Z.
 * Вывести на экран среднее арифметическое этих чисел.
 */

public class Task1 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 100);
        int y = (int) (Math.random() * 100);
        int z = (int) (Math.random() * 100);
        if (x > z) {
            System.out.println("Сумма x + y = " + (x + y));
        } else {
            System.out.println("z = " + z);
        }
        System.out.println("Среднее арифметическое = " + (x + y + z) / 3);
    }
}