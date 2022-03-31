package by.itAcademy.homeworks.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Task52 {
    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(){
                public void run(){
                    System.out.println("Thread: "+currentThread());
                    ArrayList<Integer> collection = new ArrayList(10);
                    Random random = new Random();
                    double temp=0;
                    for (int j = 0; j < 10; j++) {
                        collection.add(random.nextInt(100));
                        temp+=collection.get(j);
                    }
                    System.out.println(collection.toString());
                    System.out.println("ArrayList Lenght:"+temp/collection.toArray().length);
                }
            };
            threads[i].start();
        }
    }
}
