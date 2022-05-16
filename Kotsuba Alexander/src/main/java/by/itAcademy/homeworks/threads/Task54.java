package by.itAcademy.homeworks.threads;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

class FileThread extends Thread{
    String path = "Kotsuba Alexander\\src\\main\\resources\\Task54.txt";
    int countElementArray = 10;

    @Override
    public void run() {
        newFile(array(countElementArray), path);
        System.out.println(Thread.currentThread().getName() + " created");
    }

    public static synchronized void newFile (int [] arr, String path){
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter(path, true));
            bf.write(Arrays.toString(arr));
            bf.newLine();
            bf.flush();
            bf.close();
            System.out.println("File created");
        }catch (IOException io){
            System.out.println("File not created");
        }
    }

    public int [] array (int count) {
        int[] a = new int[count];
        try {
            Array arr = new Array();
            arr.elementArr(a);
        }catch(NullPointerException npe){
            npe.printStackTrace();
        }
        return a;
    }
}


public class Task54 {
    public static void main(String[] args) {

        int countThread = 5;

        System.out.println("Go");

        for (int i = 1; i <= countThread; i++) {
            FileThread mt = new FileThread();
            mt.setName("Поток №" + i );
            mt.start();
        }

        System.out.println("Конец!");
    }
}
