package by.itAcademy.homeworks.threads;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

class Callable59 implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("Works: " + Thread.currentThread().getName() + " : " + LocalTime.now());
        int[] listOfRandomNumbers = ThreadHelper.getRandArray(10);
        TimeUnit.SECONDS.sleep(new Random().nextInt(9) + 1);
        System.out.format("Результат работы: %d, поток - %s, текущее время - %s\n", getSumOfNumbers(listOfRandomNumbers),
                Thread.currentThread().getName(), LocalTime.now());
        return Thread.currentThread().getName();
    }

    public static int getSumOfNumbers(int[] listOfRandomNumbers) {
        Integer sum = 0;
        for (Integer i : listOfRandomNumbers) {
            sum += i;
        }
        return sum;
    }
}

public class Task59 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new ArrayList<>();
        Callable<String> callable = new Callable59();
        for(
                int i = 0;
                i< 10;i++)

        {
            Future<String> future = executor.submit(callable);
            futures.add(future);
        }
        for(
                Future<String> element :futures)

        {
            try {
                System.out.println("Забрали из futures:" + element.get() + " : " + LocalTime.now());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }

}
