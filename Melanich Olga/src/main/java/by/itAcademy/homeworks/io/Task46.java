package by.itAcademy.homeworks.io;


import java.io.File;
import java.io.IOException;

/**
 * Задание 46
 * Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны отдельно.
 */
public class Task46 {
    public static void main(String[] args)  {
        File file = new File("C:\\Users");
        System.out.println("Каталоги:");
        getListOfDirectories(file);
        System.out.println("Файлы:");
        getListFiles(file);

    }

    public static void getListOfDirectories(File directory) {
        for (File file : directory.listFiles()) {
            if (file.isDirectory()) {
                System.out.println(file.getName());
            }
        }
    }

    public static void getListFiles(File directory) {
        for (File file : directory.listFiles()) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}
