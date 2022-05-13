package by.itAcademy.homeworks.threads;

public class DeadLock implements Runnable {
    private static class Resource {
        public static long sumString(String str) {
            long time = System.currentTimeMillis();
            String s = str;
            for (int i = 0; i < 10000; i++) {
                s = s + str;
            }
            return (System.currentTimeMillis() - time);
        }
    }
    private final Resource object1 = new Resource();
    private final Resource object2 = new Resource();
    public void process1() {
        synchronized (object1) {
            System.out.println(Thread.currentThread().getName() + object1.sumString("Str") + " мс");
            synchronized (object2) {
                System.out.println(Thread.currentThread().getName() + object2.sumString("Str") + " мс");
            }
        }
    }
    public void process2() {
        synchronized (object2) {
            System.out.println(Thread.currentThread().getName() + object2.sumString("Str") + " мс");
            synchronized (object1) {
                System.out.println(Thread.currentThread().getName() + object1.sumString("Str") + " мс");
            }
        }
    }
    public void run() {
        process1();
        process2();
    }
}