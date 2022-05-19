package by.itAcademy.homeworks.MyTask;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task4 {
    public volatile static String path = "Hameza Aliaksandr\\src\\main\\resources\\Task 4";
    public static void main (String[] args) throws IOException , ClassNotFoundException , InterruptedException {
        File file = new File(path);
        file.createNewFile();
        ExecutorService executor = Executors.newFixedThreadPool(4);
        for (int i = 0; i <= 20; i++) {
            Thread generator = new Thread(new PlayerGeneratorTask(path));
            Thread reader = new Thread(new PlayerReaderTask(path));
            generator.start();
            reader.start();
            generator.join();
            reader.join();
            executor.execute(generator);
        }
        executor.shutdown();

        FileInputStream dis = new FileInputStream(path);
        ObjectInputStream dois = new ObjectInputStream(dis);
        ArrayList<Player> players = (ArrayList<Player>) dois.readObject();
        dois.close();

         players.stream().sorted(Comparator.comparing(Player::getAge)).limit(5).forEach(x -> System.out.println(x.getName().toUpperCase(Locale.ROOT)));
    }
}
