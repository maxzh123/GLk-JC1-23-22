package by.itAcademy.homeworks.io;


/** Вывести список файлов и каталогов выбранного каталога на диске. Файлы и
 > каталоги должны быть распечатаны отдельно.
 */
import java.io.File;
import java.io.IOException;

public class Task46 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Windows");
        if (file.equals(null)) {
                System.out.println("Invalid input");

        } else {getListDirectory(file);
            displayAllFilesDirectories(file);
        }
    }

    public static void getListDirectory(File file) throws IOException {
        for (File f:file.listFiles()){
            if (f.isDirectory()){
                System.out.println("directory: " + f.getCanonicalPath());
            }
        }
    }

    public static void displayAllFilesDirectories(File file) throws IOException {
        for (File f: file.listFiles()){
            if (f.isFile()){
                System.out.println("file: " + f.getCanonicalPath());
            }
        }
    }
}
