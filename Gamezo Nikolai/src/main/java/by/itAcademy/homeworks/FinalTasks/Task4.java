package by.itAcademy.homeworks.FinalTasks;

import java.io.*;

public class Task4 {
    private static String path = "Gamezo Nikolai\\src\\main\\resources\\ForFinalTask4";
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        File file = new  File(path);
        file.createNewFile();
        Thread gen = new Thread(new PlayerGeneratorTask(path));
        Thread read = new Thread(new PlayerReaderTask(path));
        gen.start();
        gen.sleep(100);
        read.start();
    }
}
