package by.itAcademy.homeworks.threads;

import java.util.ArrayList;
import java.util.List;

public class NewThread implements Runnable {
    @Override
    public void run() {
        long startTime=System.nanoTime();
        int sumOfElements=0;
        float averageOfElements=0f;
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add((int)(Math.random()*100000));
            sumOfElements+=list.get(i);
            averageOfElements=sumOfElements/2;
        }
        long time=System.nanoTime()-startTime;
        System.out.println(Thread.currentThread().getName()+" "+ list+" "+ " Average: "+averageOfElements+" execution time :"+time+" ns");

    }
}
