package by.itAcademy.homeworks.threads;

/**
 * Задание 56
 * Создать программу, которая реализует deadlock между тремя потоками.
 */

public class Task56 {
    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        Thread thread1 = new Thread(deadLock, "Thread 1: ");
        Thread thread2 = new Thread(deadLock, "Thread 2: ");
        thread1.start();
        thread2.start();
    }
}
