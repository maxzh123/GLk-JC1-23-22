package by.itAcademy.homeworks.threads;

public class DeadLock implements Runnable{
    private final Object scissors = new Object();
    private final Object paper = new Object();
    private final Object print = new Object();

    public void doSun() {
        synchronized (scissors) {
            System.out.println(Thread.currentThread().getName()
                    + " взял ножницы для вырезания солнышка");
            synchronized (paper) {
                System.out.println(Thread.currentThread().getName()
                        + " взял бумагу для вырезания солнышка");
                System.out.println(Thread.currentThread().getName()
                        + " вырезает солнышко");
                synchronized (print){
                    System.out.println(Thread.currentThread().getName()
                            + " взял краску для покраски солнышка");
                    System.out.println(Thread.currentThread().getName()
                            + " красит солнышко");
                }
            }
        }
    }

    public void doCloud() {
        synchronized (paper) {
            System.out.println(Thread.currentThread().getName()
                    + " взял бумагу для вырезания облачка");
            synchronized (scissors) {
                System.out.println(Thread.currentThread().getName()
                        + " взял ножницы для вырезания облачка");
                System.out.println(Thread.currentThread().getName()
                        + " вырезает облачко");
                synchronized (print){
                    System.out.println(Thread.currentThread().getName()
                            + " взял краску для покраски облачка");
                    System.out.println(Thread.currentThread().getName()
                            + " красит облачко");
                }
            }
        }
    }

    public void doTree() {
        synchronized (print) {
            System.out.println(Thread.currentThread().getName()
                    + " взял краску для покраски дерева");
            synchronized (paper) {
                System.out.println(Thread.currentThread().getName()
                        + " взял бумагу для вырезания дерева");
                System.out.println(Thread.currentThread().getName()
                        + " красит дерево");
                synchronized (scissors){
                    System.out.println(Thread.currentThread().getName()
                            + " взял ножницы для вырезания дерева");
                    System.out.println(Thread.currentThread().getName()
                            + " вырезает дерево");
                }
            }
        }
    }


    @Override
    public void run() {
        doCloud();
        doSun();
        doTree();
    }
}
