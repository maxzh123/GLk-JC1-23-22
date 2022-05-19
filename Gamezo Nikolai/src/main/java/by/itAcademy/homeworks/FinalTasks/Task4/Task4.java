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
        outputStream();
    }

    public static void threadPool() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        for (int i = 1; i <= 20; i++) {
            Thread generate = new Thread(new PlayerGeneratorTask(path));
            Thread read = new Thread(new PlayerReaderTask(path));
            read.join();
            generate.join();
            read.start();
            executor.execute(generate);
            generate.sleep(100);
        }
        executor.shutdown();
    }

    public static void outputStream() throws IOException, ClassNotFoundException {
        synchronized (path) {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Player> players = (ArrayList<Player>) ois.readObject();
            ois.close();
            players.stream()
                    .filter(player -> player.isActive() == true && player.getAge() >= 25 && player.getAge() <= 30)
                    .sorted(Comparator.comparing(Player::getAge))
                    .limit(5)
                    .forEach(player -> System.out.println(player.getName().toUpperCase(Locale.ROOT)));
        }
    }

    public static void createFile() throws IOException {
        synchronized (path) {
            File file = new File(path);
            file.createNewFile();
        }
    }
}
