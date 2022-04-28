package by.itAcademy.homeworks.io;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Objects;

public class Task46 {
    public static void main(String[] args) {
        File path = new File(".");
        outputListOfDirectory(path,0);
        outputListOfFiles(path,0);
    }

    public static void outputListOfDirectory(File directory, int step) {
        for (File file : directory.listFiles()) {
                if(file.isDirectory()){
                    System.out.println(file.getName()+":");
                    outputListOfFiles(file, step);
                }
                else {
                    System.out.print("-");
                    System.out.println(file.getName());
                }
        }
    }

    public static void outputListOfFiles(File directory, int step) {
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            System.out.print("-");
            if (file.isFile()) {
                System.out.println(file.getName());
            }
            else {
                outputListOfDirectory(file,step++);
            }
        }
    }
}
