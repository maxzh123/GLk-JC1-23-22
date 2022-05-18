package by.itAcademy.homeworks.FinalTasks;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task4 {
    private volatile static String path = "Gamezo Nikolai\\src\\main\\resources\\ForFinalTask4";
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        File file = new  File(path);
        file.createNewFile();
        Thread gen = new Thread(new PlayerGeneratorTask(path));
        Thread read = new Thread(new PlayerReaderTask(path));

    //    ExecutorService executor = Executors.newFixedThreadPool(4);
    //    for (int i = 1; i <= 20; i++) {
    //        Thread gen = new Thread(new PlayerGeneratorTask(path));
    //        gen.setName("Производитель № " + i);
     //       gen.start();
    //       executor.execute(gen);
    //    }
   //     executor.shutdown();
        gen.start();
   //     read.sleep(100);

        read.start();

    }
}
