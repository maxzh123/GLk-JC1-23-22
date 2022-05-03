package by.itAcademy.homeworks.io;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Objects;

public class Task46 {
    public static void main(String[] args) {
        File path = new File(".");
        outputListOfDirectory(path);
        outputListOfFiles(path);
    }

    public static void outputListOfDirectory(File directory) {
        for (File file : directory.listFiles()) {
                if(file.isDirectory()){
                    System.out.println(file.getName()+":");
                    outputListOfFiles(file);
                }
                else {
                    System.out.println(file.getName());
                }
        }
    }

    public static void outputListOfFiles(File directory) {
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
            else {
                outputListOfDirectory(file);
            }
        }
    }
}
