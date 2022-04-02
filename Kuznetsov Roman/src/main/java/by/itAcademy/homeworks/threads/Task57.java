package by.itAcademy.homeworks.threads;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

class Customer implements Runnable{
    private final Queue<Integer> integerQueue;
    private int maxQueueSize;
    private int myConsume;

    public Customer(Queue<Integer> integerQueue, int maxQueueSize) {
        this.integerQueue = integerQueue;
        this.maxQueueSize = maxQueueSize;
    }


    @Override
    public void run() {
        while (Task57.processedElements <= 10000) {
            try {
                while (integerQueue.size() == 0) {
                    System.out.println("\nПродукция закончилась. Ждём пока добавят.\n");
                    synchronized (integerQueue) {
                        integerQueue.wait();
                    }
                }
                consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        checkResult();
    }

    public void consume() {
        synchronized (integerQueue) {
            System.out.println(Thread.currentThread().getName() + " взял " + integerQueue.poll() +
                    ", это его " + ++myConsume + " купленная продукция, общее " +
                    "количество обработанных элементов: " + ++Task57.processedElements);
            while (integerQueue.size() <= 80) {
                Producer.wakeUp(); // Производители могут снова производить продукцию
                integerQueue.notifyAll();
                break;
            }
        }
    }

    public void checkResult() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ": итого купленной продукции " + myConsume);
    }
}
class Producer implements Runnable{
    private final Queue<Integer> integerQueue;
    private int maxQueueSize;
    private final Random random = new Random();
    private static boolean sleeping = false;
    private int myProduct;

    public Producer(Queue<Integer> integerQueue, int maxQueueSize) {
        this.integerQueue = integerQueue;
        this.maxQueueSize = maxQueueSize;
    }

    @Override
    public void run() {
        while (Task57.processedElements <= 10000) {
            try {
                while (integerQueue.size() >= 100) {
                    System.out.println("\nСлишком много произведенной продукции. Можно отдохнуть.\n");
                    fallAsleep(); // Запрещаем всем производителям производить продукцию.
                    synchronized (integerQueue) {
                        integerQueue.wait();
                    }
                }
                produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        checkResult();
    }

    public static void wakeUp() {
        sleeping = false;
    }

    public static void fallAsleep() {
        sleeping = true;
    }

    public void produce() {
        while (!sleeping) { // Проверка: нужно ли производить продукцию, или нет
            int x = random.nextInt(99) + 1;
            integerQueue.add(x);
            System.out.println(Thread.currentThread().getName() + " добавил " + x +
                    ", это его " + ++myProduct + " произведенная продукция, общее " +
                    "количество обработанных элементов: " + ++Task57.processedElements);
            synchronized (integerQueue) {
                integerQueue.notifyAll();
            }
            break;
        }
    }

    public void checkResult() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ": итого произведенной продукции " + myProduct);
    }
}
public class Task57 {
    public static volatile int processedElements;

    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        int maxQueueSize = 200; // Добавил макс. размер очереди, хотя именно для этого задания он не нужен.
        creatingAndStartingProducers(queue, maxQueueSize, 3);
        creatingAndStartingConsumers(queue, maxQueueSize, 2);
    }

    public static void creatingAndStartingProducers(Queue<Integer> queue, int maxQueueSize, int numberOfProducers) {
        for (int i = 0; i < numberOfProducers; i++) {
            Thread thread = new Thread(new Producer(queue, maxQueueSize));
            thread.setName("Производитель № " + (i + 1));
            thread.start();
        }
    }

    public static void creatingAndStartingConsumers(Queue<Integer> queue, int maxQueueSize, int numberOfConsumers) {
        for (int i = 0; i < numberOfConsumers; i++) {
            Thread thread = new Thread(new Customer(queue, maxQueueSize));
            thread.setName("Потребитель № " + (i + 1));
            thread.start();
        }
    }
}
