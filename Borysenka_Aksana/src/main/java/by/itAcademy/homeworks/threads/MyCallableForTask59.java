package by.itAcademy.homeworks.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class MyCallableForTask59 implements Callable {
    private int numb;

    public MyCallableForTask59(int numb) {
        this.numb = numb;
    }

    @Override
    public String call() throws Exception {
        getSumColection(numb);
        TimeUnit.SECONDS.sleep((int)(Math.random()*10+1));
        return Thread.currentThread().getName() + " count numbers in list: " + String.valueOf(getSumColection(numb));
    }

    public static int getSumColection(int numb){
        int sum = 0;
        List<Integer> lst = new ArrayList<>();
        for(int i = 0; i < numb; i++){
            lst.add((int)(Math.random()*10+1));
            sum += lst.get(i);
        }
        return sum;
    }
}
