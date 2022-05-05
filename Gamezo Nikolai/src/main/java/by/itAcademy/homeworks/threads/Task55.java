package by.itAcademy.homeworks.threads;

/**
 * Задание 55
 * Создать метод, который печатает название потока и засыпает на 2 секунды.
 * Запустить одновременно 10 потоков. Реализовать механизм синхронизации, чтобы все потоки выполнились последовательно.
 */

public class Task55 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            Thread t = new Thread (new PrintName());
            t.setName("Thread " + i);
            t.start();
            t.join();
        }
    }
    public static class PrintName implements  Runnable {
        public void run() {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
