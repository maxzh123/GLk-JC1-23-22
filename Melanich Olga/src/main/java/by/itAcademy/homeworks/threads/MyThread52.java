package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.collections.ArrayListUtil;

import java.util.ArrayList;
import java.util.List;


public class MyThread52 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
        List<Integer> arrayListForThread = new ArrayList<>();
        ArrayListUtil.fillArrayList(arrayListForThread, 10);
        System.out.println(Thread.currentThread().getName() + " finished " + calculateAverage(arrayListForThread));
    }

    public static double calculateAverage(List<Integer> arrayList) {
        int sum = 0;
        for (Integer integer : arrayList) {
            sum += integer;
        }
        return (double) sum / arrayList.size();
    }
}
