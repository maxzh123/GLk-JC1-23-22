package by.itAcademy.homeworks.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task49 {
    public static void main(String[] args) {
        File file = new File(".\\Kuznetsov Roman\\src\\main\\java\\by\\itAcademy\\homeworks\\io\\49.txt");
        List<Integer> list= binaryFileRead(file);
        System.out.println("Source file:"+Arrays.toString(list.toArray()));
        System.out.println("Average number:"+getAverageValue(list));
    }

    private static double getAverageValue(List<Integer> list) {
        int average=0;
        for (int i:list) {
            average+=i;
        }
        return (double)(average/list.size());
    }

    public static void binaryFileWrite(File file) {
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            Random random = new Random();
            for (int i = 0; i < 20; i++) {
                dos.writeInt((int)(random.nextInt(100)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Integer> binaryFileRead(File file) {
        List<Integer> arrayList = new ArrayList<>();
        try (DataInputStream dos = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            int number = dos.readInt();
            while (true) {
                arrayList.add(number);
                try {
                    number = dos.readInt();
                } catch (EOFException e) {

                    break;
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
