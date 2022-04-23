package by.itAcademy.homeworks.threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadClass implements Runnable{
    @Override
    public void run() {
        long startTime=System.nanoTime();
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add((int)(Math.random()*100000));
        }
        int maxElement=list.get(0);
        for(int i=0;i<list.size();i++){
            if(maxElement<list.get(i)) maxElement=list.get(i);
        }

        long time=System.nanoTime()-startTime;
        System.out.println(Thread.currentThread().getName()+" "+ list+" "+"MaxElement: "+maxElement+" execution time :"+time+" ns");
    }
}
