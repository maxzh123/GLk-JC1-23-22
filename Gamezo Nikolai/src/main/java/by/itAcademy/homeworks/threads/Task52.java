package by.itAcademy.homeworks.threads;

import java.util.ArrayList;

/**
 * Задание 52
 * Создать 10 потоков, каждый из которых вычисляет среднее арифметическое коллекции из 10 случайных целых чисел и выводит на экран.
 */

public class Task52 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread t = new Thread (new CalcAverage());
            t.setName("Поток " + i);
            t.start();
        }
    }
    public static class CalcAverage implements  Runnable {
        @Override
        public void run() {
            float average;
            int sum = 0;
            ArrayList<Integer> array= new ArrayList<>(10);
            for (int i = 0; i < 10; i++) {
                array.add((int) (Math.random() * 100));
                sum = sum + array.get(i);
            }
            average = sum / array.size();
            System.out.println(Thread.currentThread().getName() + " завершён, результат: " + average);
        }
    }
}
