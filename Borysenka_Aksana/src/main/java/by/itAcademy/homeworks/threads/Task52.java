package by.itAcademy.homeworks.threads;

import java.util.ArrayList;
import java.util.List;

class CalcAverage implements Runnable {

    @Override
    public void run() {
        int countNumbers = 10;
        int sum = 0;
        float average = 0;
        System.out.println(Thread.currentThread().getName() + " started!");
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < countNumbers; i++) {
            lst.add((int) (Math.random() * 100));
            sum += lst.get(i);
        }
        average = (float)sum/lst.size();
        System.out.println(Thread.currentThread().getName() + " finished: " + average);
    }
}

public class Task52 {

    /**Task52
     * Создать 10 потоков, каждый из которых вычисляет среднее арифметическое коллекции из 10 случайных целых чисел и
     * выводит на экран.
     */

    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            Thread t = new Thread(new CalcAverage());
            t.setName("Thread-" + i);
            t.start();
        }
    }
}
