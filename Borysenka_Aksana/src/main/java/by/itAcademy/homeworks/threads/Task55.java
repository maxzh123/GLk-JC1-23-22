package by.itAcademy.homeworks.threads;

class NewThread extends Thread{
    @Override
    public void run() {
        synchronized (this){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Task55 {

    /**Task55
     * Создать метод, который печатает название потока и засыпает на 2 секунды.
     * Запустить одновременно 10 потоков. Реализовать механизм синхронизации, чтобы все потоки выполнились последовательно.
     */

    public static void main(String[] args) throws InterruptedException {
        int countThread = 10;
        for(int i = 1; i <= countThread; i++){
            NewThread nt = new NewThread();
            nt.setName("Thread " + i);
            nt.start();
            nt.join();
        }
    }
}
