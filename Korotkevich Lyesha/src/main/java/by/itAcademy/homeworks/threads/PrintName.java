package by.itAcademy.homeworks.threads;

/**
 * Создать метод, который печатает название потока и засыпает на 2 секунды. Запустить одновременно 10 потоков.
 * Реализовать механизм синхронизации, чтобы все потоки выполнились последовательно.
 */

public class PrintName implements Runnable{
    public void print(){
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        synchronized (Thread.currentThread()){
            print();
        }
    }
}
