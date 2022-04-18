package by.itAcademy.homeworks.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task52 {

    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(new ThreadTask1());
        Thread t2=new ThreadTask2();
        ExecutorService e= Executors.newFixedThreadPool(5000);
        for(int i=1;i<5000;i++){
            e.submit(new ThreadTask1("Задача №"+i));
        }
        System.out.println("main закончили");
        e.shutdown();
   }

   public static void printText(Object a){
       synchronized(a){
           System.out.println(Thread.currentThread().getName());
//           try {
//               TimeUnit.SECONDS.sleep(1);
//           } catch (InterruptedException e) {
//               e.printStackTrace();
//           }

       }
   }

}
