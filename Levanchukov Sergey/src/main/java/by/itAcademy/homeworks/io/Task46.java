package by.itAcademy.homeworks.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * > Вывести список файлов и каталогов выбранного каталога на диске. Файлы и
 * > каталоги должны быть распечатаны отдельно.
 **/

public class Task46 {
    public static void main(String[] args) {
        search();
    }

    public static void search (){
        List <File> folder=new ArrayList<>();
        List <File> file=new ArrayList<>();
        File files=new File("F:\\");
            if (files.isDirectory()){
                for (File item: files.listFiles()){
                    if (item.isDirectory()) {folder.add(item);}
                    else { file.add(item);}
                }
            }
            System.out.println(folder);
            System.out.println(file);
        }
}
