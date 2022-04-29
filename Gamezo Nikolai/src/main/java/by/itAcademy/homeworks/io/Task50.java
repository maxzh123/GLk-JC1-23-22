package by.itAcademy.homeworks.io;

import java.io.*;
import java.util.Arrays;

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
        generateAndWrite();
        createReadAndWrite();

    }
    public static void createFiles() throws Exception {
        for (int i = 1; i <= 5; i++){
            File file = new File(path + "File" + i + ".txt");
            file.createNewFile();
        }
    }
    public static void generateAndWrite() {
        for (int i = 1; i <= 5; i++) {
            try (FileWriter writer = new FileWriter(path + "File" + i + ".txt", false)) {
                int array[] = new int[10];
                for (int j = 0; j < array.length; j++) {
                    array[j] = (int) (Math.random() * 10);
                }
                writer.write(Arrays.toString(array));
                writer.flush();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
    public static void createReadAndWrite() throws IOException {
        File file = new File(path + "FromPrevious5.txt");
        file.createNewFile();

        String string = "";
        String str;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path + "File" + 1 + ".txt"));
        str = bufferedReader.readLine();
        while (str != null) {
            str = bufferedReader.readLine();
            if (str != null) {
                string = string + str + " ";
            }
        }
        System.out.println(string);
    }

}
