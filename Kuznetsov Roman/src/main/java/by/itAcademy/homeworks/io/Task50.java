package by.itAcademy.homeworks.io;

import java.io.*;
import java.util.Objects;
import java.util.Random;

public class Task50 {
    private static String path = ".\\Kuznetsov Roman\\src\\main\\java\\by\\itAcademy\\homeworks\\io\\";
    public static void main(String[] args) {
        final int files = 5;
        final int numbers = 10;
        //
        path = createDirectory(path,"\\pac1\\pac2\\pac3")+"\\";
        for (int i = 0; i < files; i++) {
            fileWriteInt(numbers,path+"\\list"+i+".txt");
        }
        fileMakeSummary(path);
        fileMakeFilesManifest(path);
    }
    public static String createDirectory(String path, String dir) {
        File dirs = new File((path+dir));
        dirs.mkdirs();
        return dirs.getAbsolutePath();
    }
    public static void fileWriteInt(int quantity, String path){
        Random random = new Random();
        try(FileWriter writer = new FileWriter(path)){
            for (int i = 0; i < quantity; i++) {
                writer.write(random.nextInt(100));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void fileMakeSummary(String path){
        try {
            FileWriter writer = new FileWriter(path+"\\"+"Summary.txt");
            for (File file : Objects.requireNonNull(new File(path + "\\.").listFiles())) {
                if (file.isFile()&&file.getName().contains("list")) {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader("\\"+path+file.getName()));
                    String str = bufferedReader.readLine();
                    while (str != null) {
                        writer.write(str+"\n");
                        str = bufferedReader.readLine();
                    }
                }
            }
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void fileMakeFilesManifest(String path){
        try {
        FileWriter writer = new FileWriter("\\"+path+"Manifest.txt");
        for (File file : Objects.requireNonNull(new File(path).listFiles())) {
            if (file.isFile()) {
                writer.write(file.getName()+"\n");
            }
        }
        writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
