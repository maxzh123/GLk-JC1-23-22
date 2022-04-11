package by.itAcademy.homeworks.io;

import by.itAcademy.homeworks.helper.Array;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task50 {

    /**Task50
     * Создать цепочку из трех папок. В конечном каталоге создать 5 произвольных текстовых файлов.
     * Заполнить их 10 произвольными целыми числами. Содержимое файлов записать в один файл в том же каталоге.
     * Создать файл, который будет содержать список файлов данного каталога.
     */

    public static void main(String[] args) {

        int countOfFile = 5;
        int countOfNumbers = 10;
        String prefixOfNameFile = "File";
        String fileExtension = ".txt";
        String path = "Borysenka_Aksana\\src\\main\\resources\\";

        path = createDirectory(path);

        for(int i = 1; i <= countOfFile; i++) {
          createTextFile(path + prefixOfNameFile + i + fileExtension, createArray(countOfNumbers));
        }

        createFileWithInfoAllFile(path);
        createNewFileWithNamesAllFiles(path);
    }

    public static int[] createArray(int x){
        int[] arr = new int[x];
        Array r = new Array();
        r.elementArr(arr);
        return arr;
    }

    public static String createDirectory(String path) {
        path = path + "ForTask50\\ForTask50_1\\ForTask50_2\\";
        File f = new File(path);
        f.mkdirs();
        return path;
    }

    public static void createTextFile(String path, int [] arr){
        try(BufferedWriter bf = new BufferedWriter(new FileWriter(path))){
            bf.write(Arrays.toString(arr));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createFileWithInfoAllFile(String p)  {
        List s = new ArrayList();
        File dir = new File(p);
        File [] f = dir.listFiles();
        for (File i : f) {
            if (i.isFile() && i.getName().contains("File")) {
                try(BufferedReader br = new BufferedReader(new FileReader(i))){
                    String strBr;
                    while((strBr = br.readLine()) != null){
                        s.add("\n" + strBr );
                    }
                }catch (IOException e) {
                    e.printStackTrace();
                }

                try(BufferedWriter bf = new BufferedWriter(new FileWriter(p + "AllInfo.txt"))){
                    bf.write(s.toString());
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void createNewFileWithNamesAllFiles (String path) {
        List lst = new ArrayList<>();
        File dir = new File(path);
        File [] f = dir.listFiles();
        for (File i : f) {
            if (i.isFile()) {
                lst.add(i.getName());
            }
        }

        try(BufferedWriter bf = new BufferedWriter(new FileWriter(path + "AllNames.txt"))){
            bf.write(lst.toString());
            bf.flush();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}


