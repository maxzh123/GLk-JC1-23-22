package by.itAcademy.homeworks.threads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * > Создать метод, который печатает название потока и засыпает на 2 секунды.
 * > Запустить одновременно 10 потоков. Реализовать механизм синхронизации, чтобы
 * > все потоки выполнились последовательно.
 */
class PrintThreadName implements Runnable {

    @Override
    public void run() {
        synchronized (PrintThreadName.class) {
            System.out.println(Thread.currentThread().getName()+" working");
            try {
                TimeUnit.SECONDS.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Task55 {
    public static void main(String[] args) throws InterruptedException {
        Thread th;
        for(int i=0;i<=10;i++){
            th=new Thread(new PrintThreadName());
            th.start();
            th.join();
        }

    }


}


