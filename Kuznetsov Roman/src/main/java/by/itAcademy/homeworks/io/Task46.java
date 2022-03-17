package by.itAcademy.homeworks.io;

import java.io.File;
import java.nio.file.Files;
import java.util.Objects;

public class Task46 {
    public static void main(String[] args) {
        File path = new File(".");
        outputListOfDirectory(path);
        outputListOfFiles(path);
    }

    public static void outputListOfDirectory(File directory) {
        System.out.println("Каталоги:");
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (file.isDirectory()) {
                System.out.println(file.getName());
            }
        }
    }

    public static void outputListOfFiles(File directory) {
        System.out.println("Файлы:");
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}
