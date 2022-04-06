package by.itAcademy.homeworks.io;

import java.io.File;

public class Task46 {

    /**Task46
     * Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны отдельно.
     */

    public static void main(String[] args) {
        File f = new File("C:\\Windows");
        if (f.equals(null)) {
            System.out.println("Путь должен быть не null");
        }else{
            System.out.println("Список каталогов:");
            getListDirectiry(f);
            System.out.println("Список файлов:");
            getListFile(f);
        }

    }


    public static void getListDirectiry(File f){
        for (File file : f.listFiles()) {
            if(file.isDirectory()) {
                System.out.println(file.getName());
            }
        }
    }


    public static void getListFile(File f){
        for (File file : f.listFiles()) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}
