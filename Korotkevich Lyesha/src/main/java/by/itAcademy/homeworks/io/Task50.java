package by.itAcademy.homeworks.io;

import java.io.*;
import java.util.Random;

/**Создать цепочку из трех папок. В конечном каталоге создать 5 произвольных текстовых файлов.
Заполнить их 10 произвольными целыми числами. Содержимое файлов записать в один файл в том же каталоге.
 Создать файл, который будет содержать список файлов данного каталога.*/

public class Task50 {
    private static String path = "Korotkevich Lyesha/src/main/resources/Task50/";
    private final static String SEP = File.separator;

    public static void main(String[] args) throws Exception {
        createFolders(3);
        createFiles(5);
        fillFiles(10);
        summarize();
        listOfFileNames();
    }

    public static void createFolders(int n) throws Exception {
        for (int i = 0; i < n; i++){
            path += i+SEP;
            File file = new File(path);
            boolean f = file.mkdir();
            if(!f){
                throw (new Exception("Directory isn't created "));
            }
        }
    }

    public static void createFiles(int n) throws Exception {
        for (int i = 0; i < n; i++){
            File file = new File(path + i + ".txt");
            boolean f = file.createNewFile();
            if(!f){
                throw (new Exception("File isn't created "));
            }
        }
    }

    public static void fillFiles(int n){
        Random random = new Random();

        File file = new File(path);
        for (File f : file.listFiles()){
            try {
                BufferedOutputStream output= new BufferedOutputStream(new FileOutputStream(f));
                for (int i = 0; i < n; i++) {
                    output.write(random.nextInt());
                }
                output.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void summarize(){
        File file= new File(path);
        BufferedOutputStream output = null;
        try {
            output= new BufferedOutputStream(new FileOutputStream(path + "allPrevious.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedInputStream input;
        for (File f : file.listFiles()){
            try {
                input = new BufferedInputStream(new FileInputStream(f));
                int a ;
                while ((a = input.read()) != -1){
                    if (output != null) {
                        output.write(a);
                    }
                }
                if (output != null) {
                    output.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void listOfFileNames(){
        File file= new File(path);
        BufferedWriter output = null;
        try {
            output= new BufferedWriter(new FileWriter(path + "FileNames.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (File f: file.listFiles()){
            try {
                output.write(f.getName()+"; ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
