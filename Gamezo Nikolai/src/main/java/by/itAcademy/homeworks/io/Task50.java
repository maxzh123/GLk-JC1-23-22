package by.itAcademy.homeworks.io;

import java.io.File;

/**
 * Задание 50
 * Создать цепочку из трех папок. В конечном каталоге создать 5 произвольных текстовых файлов.
 * Заполнить их 10 произвольными целыми числами. Содержимое файлов записать в один файл в том же каталоге.
 * Создать файл, который будет содержать список файлов данного каталога.
 */

public class Task50 {
    private static String path = "Gamezo Nikolai\\src\\main\\resources\\Task50\\Folder1\\Folder2\\Folder3\\";
    public static void main(String[] args) throws Exception {
        new File(path).mkdirs();
        createFiles();
    }
    public static void createFiles() throws Exception {
        for (int i = 1; i <= 5; i++){
            File file = new File(path + "File" + i + ".txt");
            boolean f = file.createNewFile();
        }
    }
}
