package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.Untils.RandomArray;
import by.itAcademy.homeworks.arrays.Task20;

public class Task53 {
    public static class MyThread extends Thread {
        Thread th;

        public MyThread() {
            th = new Thread(this);
        }
    }

    public void run() {
        int[] a = RandomArray.randomArray(10);
        int max = Task20.maxIndexofArray(a);
        System.out.println("Thread name: " + "max:" + max);

    }

    public static void main(String[] args) {
        Thread p1 = new Thread(new MyThread());
        Thread p2 = new Thread(new MyThread());
        Thread p3 = new Thread(new MyThread());
        Thread p4 = new Thread(new MyThread());
        Thread p5 = new Thread(new MyThread());
        Thread p6 = new Thread(new MyThread());
        Thread p7 = new Thread(new MyThread());
        Thread p8 = new Thread(new MyThread());
        Thread p9 = new Thread(new MyThread());
        Thread p10 = new Thread(new MyThread());
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        p9.start();
        p10.start();
    }
}
