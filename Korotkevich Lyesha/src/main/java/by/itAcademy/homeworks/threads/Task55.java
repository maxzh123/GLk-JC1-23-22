package by.itAcademy.homeworks.threads;

/**
 * Создать метод, который печатает название потока и засыпает на 2 секунды. Запустить одновременно 10 потоков.
 * Реализовать механизм синхронизации, чтобы все потоки выполнились последовательно.
 */

public class Task55 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new PrintName());
            t.start();
        }
    }
}
