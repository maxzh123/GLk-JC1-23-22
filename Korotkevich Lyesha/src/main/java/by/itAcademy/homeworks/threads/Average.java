package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.io.Task51;
import java.util.ArrayList;

public class Average implements Runnable{

    @Override
    public void run() {
        float average;
        int sum = 0;

        ArrayList<Integer> arr= new ArrayList<>(10);
        for (int i = 0; i < 10; i++){
            arr.add(Task51.generateInt(1, 100));
        }

        for (Integer integer : arr) {
            sum += integer;
        }
        average = (float)sum/arr.size();
        System.out.println(Thread.currentThread().getName()+ " вычислил: " + average);
    }
}
