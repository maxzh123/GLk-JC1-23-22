package by.itAcademy.homeworks.threads;

public class Task55 {
    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(){
                @Override
                public synchronized void run() {
                        System.out.println(currentThread().getName());
                        try {
                            sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            };
            threads[i].start();
        }
    }
}
