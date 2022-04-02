package by.itAcademy.homeworks.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class Task53{

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread() {
                public void run() {
                    int[] arrayForThread = ThreadHelper.getRandArray(10);
                    OptionalInt indexMaxElement = Arrays.stream(arrayForThread).max();
                    System.out.println(Thread.currentThread().getName() + " создал массив: "
                            + Arrays.toString(arrayForThread) +
                            " и нашёл его максимальный элемент равный: " + indexMaxElement.toString());
                }
            };
            threads[i].start();
        }
    }
}
