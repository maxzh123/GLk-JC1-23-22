package by.itAcademy.homeworks.threads;

import java.io.IOException;

public class Task54 {
    public static void main(String[] args) throws IOException {
        int amountThreads = 5;
        Thread[] threadsArray = new Thread[amountThreads];
        creatingThreads(threadsArray);
        startingThreads(threadsArray);
    }
    public static void creatingThreads(Thread[] threadsArray) throws IOException {
        for (int i = 0; i < threadsArray.length; i++) {
            MyThread54.goToNextFile();
            threadsArray[i] = new Thread(new MyThread54(ThreadHelper.getRandArray(10)));
            threadsArray[i].setName("Поток №" + (i + 1));
        }
    }

    public static void startingThreads(Thread[] threadsArray) {
        for (Thread thread : threadsArray) {
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
