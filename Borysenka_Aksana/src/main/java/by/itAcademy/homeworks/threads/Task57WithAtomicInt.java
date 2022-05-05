package by.itAcademy.homeworks.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

class Prod implements Runnable{
    AtomicInteger at;
    BlockingQueue q;
    int maxEl = 10_000;

    public Prod(AtomicInteger at, BlockingQueue q) {
        this.at = at;
        this.q = q;
    }

    @Override
    public void run() {
        while (at.get() < maxEl){
            if(q.size() >= 100){
                try {
                    synchronized (q) {
                        q.wait();
                        System.out.println(Thread.currentThread().getName() + " sleep.");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                try {
                    q.put(getRandom());
                    System.out.println(Thread.currentThread().getName() + " work" + ", number of processed elements " + at.incrementAndGet());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished.");
    }

    private int getRandom(){
        return (int)(Math.random()*100);
    }
}

class Cons implements Runnable {
    AtomicInteger at;
    BlockingQueue q;
    int maxEl = 10_000;

    public Cons(AtomicInteger at, BlockingQueue q) throws InterruptedException {
        this.at = at;
        this.q = q;
    }

    @Override
    public void run() {
        while (at.get() < maxEl) {
            if (q.size() <= 80) {
                synchronized (q) {
                    q.notifyAll();
                    System.out.println(Thread.currentThread().getName() + " consume.");
                }
            } else {
                try {
                    synchronized (q) {
                        q.take();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " work" + ", number of processed elements " + at.incrementAndGet());
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished.");
    }
}


public class Task57WithAtomicInt {

    public static void main(String[] args) throws InterruptedException {
        int countElOfQueue = 200;
        AtomicInteger countElements = new AtomicInteger();
        BlockingQueue<Integer> queue = new ArrayBlockingQueue(countElOfQueue,true);

        Thread p1 = new Thread(new Prod(countElements, queue), "Producer1");
        Thread p2 = new Thread(new Prod(countElements, queue), "Producer2");
        Thread p3 = new Thread(new Prod(countElements, queue), "Producer3");

        Thread c1 = new Thread(new Cons(countElements, queue), "Concumer1");
        Thread c2 = new Thread(new Cons(countElements, queue), "Concumer2");

        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();
    }
}
