package by.itAcademy.homeworks.threads;

/**
 * Задание 52
 * Создать 10 потоков.
 * Каждый поток вычисляет среднее арифметическое коллекции из 10 случайных целых чисел.
 * Среднее арифметическое вывести на экран.
 */

public class Task52 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new MyThread52());
            thread.setName("thread " + (i +1));
            thread.start();
        }
    }
}
