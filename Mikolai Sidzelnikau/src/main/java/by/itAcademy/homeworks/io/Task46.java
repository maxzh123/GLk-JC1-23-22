package by.itAcademy.homeworks.io;
import java.io.*;

/**## Задание 46
        > Вывести список файлов и каталогов выбранного каталога на диске. Файлы и
         > каталоги должны быть распечатаны отдельно.*/

public class Task46 {
    public static void main(String[] args) throws IOException {
        File file2 = new File(String.valueOf(new File("Mikolai Sidzelnikau/src/main/resources/text.txt").getParent()));
        System.out.println("Папка \\"+ file2.getName());
        File[] file3 = new File("Mikolai Sidzelnikau/src/main/resources").listFiles();
        for (int i = 0; i <file3.length; i++) {
            System.out.println("\\"+file3[i].getName());
        }
    }
}