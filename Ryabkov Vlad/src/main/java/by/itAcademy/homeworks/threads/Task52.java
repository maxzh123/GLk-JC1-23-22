package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.collections.RandomArrayList;

import java.util.ArrayList;

/**
 * Создать 10 потоков, каждый из которых вычисляет среднее арифметическое
 * коллекции из 10 случайных целых чисел и выводит на экран.
 */




public class Task52<randomArrayList> {
    static class newThread extends Thread{

        @Override
        public void run() {
            ArrayList<Integer> myList = new ArrayList<>();
            ArrayList<Integer> newList = RandomArrayList.fillArrayList(myList, 10);
            int average = 0;
            int sum = 0;
            for (int i = 0; i <newList.size() ; i++) {
                int a = newList.get(i);
                sum+=a;

            }
            average = sum /newList.size();
            System.out.println(average);
        }
    }

    public static void main(String[] args) {
        newThread t1 = new newThread();
        newThread t2 = new newThread();
        newThread t3 = new newThread();
        newThread t4 = new newThread();
        newThread t5 = new newThread();
        newThread t6 = new newThread();
        newThread t7 = new newThread();
        newThread t8 = new newThread();
        newThread t9 = new newThread();
        newThread t10 = new newThread();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}
