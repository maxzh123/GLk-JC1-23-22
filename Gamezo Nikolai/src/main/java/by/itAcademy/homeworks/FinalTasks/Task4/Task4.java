package by.itAcademy.homeworks.FinalTasks.Task4;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task4 {
    private volatile static String path = "Gamezo Nikolai\\src\\main\\resources\\ForFinalTask4";
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        File file = new File(path);
        file.createNewFile();
        ExecutorService executor = Executors.newFixedThreadPool(4);
        for (int i = 1; i <= 20; i++) {
            Thread gen = new Thread(new PlayerGeneratorTask(path));
            Thread read = new Thread(new PlayerReaderTask(path));
            gen.start();
            read.start();
            gen.join();
            read.join();
            executor.execute(gen);
        }
        executor.shutdown();


        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Player> players = (ArrayList<Player>) ois.readObject();
        ois.close();

        players.stream().sorted(Comparator.comparing(Player::getAge)).limit(5).forEach(x -> System.out.println(x.getName().toUpperCase(Locale.ROOT)));
    }
}
