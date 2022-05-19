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
        createFile();
        threadPool();
        stream();
    }

    public static void threadPool() throws InterruptedException {
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
    }

    public static void stream() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Player> players = (ArrayList<Player>) ois.readObject();
        ois.close();
        players.stream()
                .filter(player -> player.isActive() == true  && player.getAge() >= 25 && player.getAge() <= 30)
                .sorted(Comparator.comparing(Player::getAge))
                .limit(5)
                .forEach(player -> System.out.println(player.getName().toUpperCase(Locale.ROOT)));
    }

    public static void createFile() throws IOException {
        File file = new File(path);
        file.createNewFile();
    }
}
