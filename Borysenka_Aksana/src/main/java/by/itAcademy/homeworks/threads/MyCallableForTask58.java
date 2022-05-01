package by.itAcademy.homeworks.threads;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class MyCallableForTask58 implements Callable {
    private String path;

    public MyCallableForTask58(String path) {
        this.path = createDirectory(path);
    }

    @Override
    public String call() throws Exception {
        createTextFiles(path);
        List lst = new ArrayList<>();
        File dir = new File(path);
        File [] f = dir.listFiles();
        for (File i : f) {
            if (i.isFile()) {
                lst.add(i.getName());
            }
        }
        TimeUnit.SECONDS.sleep(2);
        return Thread.currentThread().getName() +" список файлов: " + lst;
    }

    public static String createDirectory(String path) {
        path = path + "ForTask58\\";
        File f = new File(path);
        f.mkdirs();
        return path;
    }

    public static void createTextFiles(String path) {
        String str = "Hello";
        int numberOfRows = 10;
        int numberOfFile = 10;
        String prefixOfNameFile = "File_";
        String fileExtension = ".txt";

        for (int j = 1; j <= numberOfFile; j++) {
            try (BufferedWriter bf = new BufferedWriter(new FileWriter(path + prefixOfNameFile + j + fileExtension))) {
                for (int i = 0; i < numberOfRows; i++) {
                    bf.write(str);
                    bf.newLine();
                }
                bf.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
