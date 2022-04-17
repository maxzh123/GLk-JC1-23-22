package by.itAcademy.homeworks.io;

import java.io.*;

/**
 * > Вывести список файлов и каталогов выбранного каталога на диске. Файлы и
 * > каталоги должны быть распечатаны отдельно.
 */

public class Task46 {
    public static void main(String[] args) throws IOException {
        File a = new File("G:\\");
        getCatalogs(a);
        getFiles(a);
        BufferedWriter wr=new BufferedWriter(new FileWriter("Katarski Aliaksei/src/main/resources/ForTask46.txt"));
        wr.write("Files : ");
        wr.write((getFiles(a)));
        wr.write("Catalogs : ");
        wr.write(getCatalogs(a));
        wr.close();
}

    public static String getFiles(File catalogs) throws IOException {
        StringBuilder stringBuilder = new StringBuilder("");
        for (File f : catalogs.listFiles()) {
            if (f.isFile()) {
                stringBuilder.append(f.getName()).append(System.lineSeparator());
                System.out.println("Files : "+ f.getName());
                }
            }
        return stringBuilder.toString();
    }

    public static String getCatalogs(File files){
        StringBuilder sb=new StringBuilder("");
        for(File f:files.listFiles()){
            if(f.isDirectory()){
                sb.append(f.getName()).append(System.lineSeparator());
                System.out.println("Catalogs : "+f.getName());
            }
        }return sb.toString();
    }
}

