package by.itAcademy.homeworks.threads;

/**
 * Задание 57
 * Есть 3 производителя и 2 потребителя, все разные потоки и работают все одновременно.
 * Есть очередь с 200 элементами. Производители добавляют случайное число от 1..100, а потребители берут эти числа.
 * Если в очереди элементов >= 100 производители спят, если нет элементов в очереди – потребители спят.
 * Если элементов стало <= 80, производители просыпаются.
 * Все это работает до тех пор, пока обработанных элементов не станет 10000, только потом программа завершается.
 */

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Task57 {
    public static volatile int producedElements;
    private static boolean sleep = false;
    public static void main(String[] args) {
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        for (int i = 1; i <= 3; i++) {
            Thread thread = new Thread(new Producer(queue));
            thread.setName("Производитель № " + i);
            thread.start();
        }
        for (int i = 1; i <= 2; i++) {
            Thread thread = new Thread(new Consumer(queue));
            thread.setName("Потребитель № " + i);
            thread.start();
        }
    }
    static class Producer implements Runnable {
        private final Queue<Integer> queue;
        Producer(Queue<Integer> queue) {
            this.queue = queue;
        }
        @Override
        public void run() {
            while (producedElements < 10000) {
                try {
                    while (queue.size() >= 100) {
                        sleep = false;
                        synchronized (queue) {
                            queue.wait();
                        }
                    }
                    produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        public void produce() {
            while (sleep == false) {
                int x = (int) (Math.random() * 101);
                queue.add(x);
                System.out.println(Thread.currentThread().getName() + " добавил число: " + x + " Элементов в очереди : " + queue.size());
                synchronized (queue) {
                    queue.notifyAll();
                }
                break;
            }
        }
    }
    static class Consumer implements Runnable {
        private final Queue<Integer> queue;
        Consumer(Queue<Integer> queue) {
            this.queue = queue;
        }
        @Override
        public void run() {
            while (producedElements < 10000) {
                try {
                    while (queue.size() == 0) {
                        synchronized (queue) {
                            queue.wait();
                        }
                    }
                    consume();
                    producedElements++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        public void consume() {
            synchronized (queue) {
                System.out.println(Thread.currentThread().getName() + " взял число: " + queue.poll() + " Элементов в очереди: " + queue.size() + " Обработано элементов: " + producedElements);
                while (queue.size() <= 80) {
                    sleep = false;
                    queue.notifyAll();
                    break;
                }
            }
        }
    }
}

