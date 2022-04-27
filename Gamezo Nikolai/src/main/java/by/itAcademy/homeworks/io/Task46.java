package by.itAcademy.homeworks.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

/**
 * Задание 46
 * Вывести список файлов и каталогов выбранного каталога на диске.
 * Файлы и каталоги должны быть распечатаны отдельно.
 */

public class Task46 {
    public static void main(String[] args) throws IOException {
        File path = new File("D:\\World of Warcraft");
        System.out.println("Список каталогов:" + "\n");
        displayListDirectiry(path);
        System.out.println("\n" + "Список файлов:" + "\n");
        displayListFile(path);
        System.out.println("\n" + "Со звёздочкой:" + "\n");
        displayListWithStar(path);
    }
    public static void displayListDirectiry(File path) {
        for (File file : path.listFiles()) {
            if(file.isDirectory()) {
                System.out.println(file.getName());
            }
        }
    }
    public static void displayListFile(File path) {
        for (File file : path.listFiles()) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
    //валится если нет доступа AccessDeniedException
    public static void displayListWithStar(File path) throws IOException {
        Files.walk(Paths.get(path.toString()), FileVisitOption.FOLLOW_LINKS).map(Path::toFile).forEach(f -> {
            System.out.println(f.getAbsolutePath() + (f.isDirectory() ? " каталог" : " файл"));
        });
    }
}
