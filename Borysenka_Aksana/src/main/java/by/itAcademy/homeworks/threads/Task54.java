package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.helper.Array;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

class MyThread54 extends Thread{
    String path = "Borysenka_Aksana\\src\\main\\resources\\ForTask54.txt";
    int countElementArray = 10;

    @Override
    public void run() {
        synchronized (this) {
            newFile(array(countElementArray), path);
            System.out.println(Thread.currentThread().getName() + " created");
        }
    }

    public void newFile (int [] arr, String path){
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

    /**Task54
     * Создать класс поток, который создает средствами Java файл и записать в него произвольно сгенерированный
     * массив из 10 случайных целых чисел. Запустить 5 потоков.
     */

    public static void main(String[] args) {

        int countThread = 5;

        System.out.println("Go");

            for (int i = 1; i <= countThread; i++) {
                MyThread54 mt = new MyThread54();
                mt.setName("Thread №" + i );
                mt.start();
            }

        System.out.println("End");
    }
}
