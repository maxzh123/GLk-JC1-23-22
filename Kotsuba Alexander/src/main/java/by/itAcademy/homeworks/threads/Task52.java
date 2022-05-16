/*Task52
 Создать 10 потоков, каждый из которых вычисляет среднее арифметическое коллекции из 10 случайных целых чисел и
 выводит на экран.
 */

package by.itAcademy.homeworks.threads;

import java.util.ArrayList;
import java.util.List;

class CalcAverage implements Runnable{
    @Override
    public void run() {
        int countNumbers = 10;
        int sum = 0;
        float average = 0;
        System.out.println(Thread.currentThread().getName() + " действует");
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < countNumbers ; i++){
            list.add((int)(Math.random()*100));
            sum+=list.get(i);
        }
        average = (float) sum/list.size();
        System.out.println(Thread.currentThread().getName() + " завершился" + average);
    }
}

public class Task52 {
    public static void main(String[] args) {
        for(int i = 0 ; i<10 ; i++){
            Thread thread = new Thread(new CalcAverage());
            thread.setName("Поток: " + i);
            thread.start();
        }
    }
}
