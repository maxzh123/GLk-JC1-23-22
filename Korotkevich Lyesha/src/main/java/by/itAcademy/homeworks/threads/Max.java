package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.io.Task51;

import java.util.ArrayList;

public class Max implements Runnable{

    @Override
    public void run() {
        int max = 0;

        ArrayList<Integer> arr= new ArrayList<>(10);
        for (int i = 0; i < 10; i++){
            arr.add(Task51.generateInt(1, 100));
        }

        for (Integer integer : arr) {
            if (integer > max){
                max = integer;
            }
        }

        System.out.println(Thread.currentThread().getName()+ " вычислил: " + max);
    }
}
