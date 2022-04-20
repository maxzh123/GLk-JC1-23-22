package by.itAcademy.homeworks.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны отдельно.*/

public class Task46 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> files = new ArrayList<>();
        ArrayList<String> catalogs = new ArrayList<>();
        File source = new File("/Users/leha/Downloads");
        if (source.isDirectory()){
            for(File file : source.listFiles()){
                if(file.isDirectory()){
                    catalogs.add(file.getName());
                }else{
                    files.add(file.getName());
                }
            }
        }
        System.out.println("Файлы: "+ files);
        System.out.println("Каталоги :" + catalogs);
    }
}
