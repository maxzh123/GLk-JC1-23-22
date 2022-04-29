package by.itAcademy.homeworks.threads;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


class Producer implements Runnable {
    private BlockingQueue<Integer> q;
    private static boolean sleeping = false;

    public Producer(BlockingQueue<Integer> q) {
        this.q = q;
    }

    @Override
    public void run() {
        while (Task57.processedElements < 10_000) {
            try {
                while (q.size() >= 100) {
                    System.out.println(Thread.currentThread().getName() + "продукции много, спим");
                    asleep();
                    q.wait();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            produce();
        }
    }

    public void asleep() {
        sleeping = true;
    }

    public static void wakeUp() {
        sleeping = false;
    }

    public void produce() {
        int x = (int) (Math.random() * 100 + 1);
        if (!sleeping) {
            q.add(x);
            System.out.println(Thread.currentThread().getName()+ " добавил элемент: " + x + ", количество обработанных элементов: " + Task57.processedElements++);
        }

    }
}

class Consumer implements Runnable{
    BlockingQueue q;

    public Consumer(BlockingQueue q) {
        this.q = q;
    }

    @Override
    public void run() {
        while (Task57.processedElements < 10_000){
            while (q.size() == 0) {
                System.out.println("нет элементов, спим");
                try {
                    q.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            consume();
        }
    }

    public void consume(){
        while(q.size() != 0){
            System.out.println(Thread.currentThread().getName() + " взял элемент: " + q.poll() + ", количество обработанных элементов: " +  Task57.processedElements++);
        }
        if(q.size() <=80){
            System.out.println("заставляем работать производителей");
            Producer.wakeUp();
            q.notifyAll();
        }
    }
}

public class Task57 {

    /**Task57
     * Есть 3 производителя и 2 потребителя, все разные потоки и работают все одновременно. Есть очередь с 200 элементами.
     * Производители добавляют случайное число от 1..100, а потребители берут эти числа.
     * Если в очереди элементов >= 100 производители спят, если нет элементов в очереди – потребители спят.
     * Если элементов стало <= 80, производители просыпаются. Все это работает до тех пор, пока обработанных элементов не станет 10000,
     * только потом программа завершается.
     */

    public static volatile int processedElements;
//    AtomicInteger processedElements = new AtomicInteger();

    public static void main(String[] args) {

        int countElementOfQueue = 200;
        BlockingQueue<Integer> queue = new ArrayBlockingQueue(countElementOfQueue,true);
//        for (int i = 0; i<80; i++){
//            queue.add(i);
//        }
//        System.out.println(queue.remainingCapacity() + ", " + queue.size());

        Thread p1 = new Thread(new Producer(queue));
        Thread p2 = new Thread(new Producer(queue));
        Thread p3 = new Thread(new Producer(queue));
        p1.start();
        p2.start();
        p3.start();

        Thread c1 = new Thread(new Consumer(queue));
        Thread c2 = new Thread(new Consumer(queue));
        c1.start();
        c2.start();
    }
}
