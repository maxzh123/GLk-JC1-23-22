package by.itAcademy.homeworks.threads;

/**Создать программу, которая реализует deadlock между тремя потоками.*/

public class Task56 {
    public static void main(String[] args) {
        DeadLock dead = new DeadLock();
        Thread t1 = new Thread(dead);
        Thread t2 = new Thread(dead);
        Thread t3 = new Thread(dead);
        t1.start();
        t2.start();
        t3.start();
    }
}
