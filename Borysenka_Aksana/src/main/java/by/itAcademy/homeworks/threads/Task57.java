package by.itAcademy.homeworks.threads;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


class Producer implements Runnable {
    private BlockingQueue<Integer> q;

    public Producer(BlockingQueue<Integer> q) {
        this.q = q;
    }

    @Override
    public void run() {
        while (Task57.processedElements < 10_000) {
            while(q.size() <= 80) {
                wakeUp();
                produce();
                if(q.size() >= 100){
                    System.out.println(Thread.currentThread().getName() + "продукции много, спим");
                    asleep();
                }
            }
        }
    }

    public void asleep(){
        synchronized (q) {
            try {
                q.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void wakeUp() {
        synchronized (q) {
            q.notifyAll();
        }
    }

    public void produce() {
        int x = (int) (Math.random() * 100 + 1);
            q.add(x);
            System.out.println(Thread.currentThread().getName()+ " добавил элемент: " + x + ", количество обработанных элементов: " + Task57.processedElements++);
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
            consume();
        }
    }

    public void consume(){
        if(q.size() != 0){
            System.out.println(Thread.currentThread().getName() + " взял элемент: " + q.poll() + ", количество обработанных элементов: " + Task57.processedElements++);
        }else if (q.size() == 0) {
            System.out.println("нет элементов, спим");
            try {
                synchronized (q) {
                    q.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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

    public static void main(String[] args) {

        int countElementOfQueue = 200;
        BlockingQueue<Integer> queue = new ArrayBlockingQueue(countElementOfQueue,true);

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
