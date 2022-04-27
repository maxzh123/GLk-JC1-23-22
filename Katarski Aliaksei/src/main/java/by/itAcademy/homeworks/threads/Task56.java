package by.itAcademy.homeworks.threads;

import java.util.concurrent.TimeUnit;

/**
 * Создать программу, которая реализует deadlock между тремя потоками.
 */
class A {
    synchronized void foo(B b) {
        System.out.println(Thread.currentThread().getName() + " calling .foo in A");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("A problem");
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " A.last()");
        b.last();
    }
    synchronized void last(){
        System.out.println(" A.last()");
    }
}

    class B {
        synchronized void bar(A a) {
            System.out.println(Thread.currentThread().getName() + " calling .bar in B");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Problem at B");
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " A.last()");
            a.last();
        }
            synchronized void last(){
                System.out.println(" B.last()");

            }
}



class Deadlock implements Runnable{
    A a=new A();
    B b=new B();

    Deadlock(){
        Thread.currentThread().setName(" ");
        Thread t=new Thread(this," ");

    }

    @Override
    public void run() {
        a.foo(b);
        b.bar(a);
    }
}

public class Task56 {
    public static void main(String[] args) {
        Deadlock lock=new Deadlock();
        Thread th=new Thread(lock,"A");
        Thread th_1=new Thread(lock,"B");
        th.start();
        th_1.start();
    }

}
