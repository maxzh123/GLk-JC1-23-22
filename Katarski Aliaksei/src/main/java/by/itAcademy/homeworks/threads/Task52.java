package by.itAcademy.homeworks.threads;

import java.util.ArrayList;
import java.util.List;

/**
 * > Создать 10 потоков, каждый из которых вычисляет среднее арифметическое
 * > коллекции из 10 случайных целых чисел и выводит на экран.
 */

public class Task52 {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            Thread myThread=new Thread(new NewThread());
            myThread.start();
        }
    }

}


