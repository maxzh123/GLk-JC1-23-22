package by.itAcademy.homeworks.threads;

import java.util.concurrent.TimeUnit;

public class ThreadTask2 extends Thread{
    private static volatile boolean isAlive=true;

    @Override
    public void run() {
            System.out.println("Task2 начали");
            Task52.printText(Task53.class);
        synchronized (this){
            this.notifyAll();
        }
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
                isAlive=false;
            }
            System.out.println("Task2 закончили");
    }
}
