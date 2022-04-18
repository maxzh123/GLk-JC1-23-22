package by.itAcademy.homeworks.threads;

import java.util.concurrent.TimeUnit;

public class ThreadTask1 implements Runnable{
    private final String name;

    public ThreadTask1(String name) {
        this.name=name;
    }

    public ThreadTask1() {
        this.name="Безымянный";
    }

    @Override
    public void run() {
        System.out.println("Task1 "+name+" начали в"+Thread.currentThread().getName());
        try {
            TimeUnit.MILLISECONDS.sleep((int)(1000*Math.random()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task1 "+name+" закончили");
    }
}
