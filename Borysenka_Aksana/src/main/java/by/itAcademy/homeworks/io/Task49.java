package by.itAcademy.homeworks.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task49 {

    /**Task49
     * Записать с помощью Java в двоичный файл 20 случайных чисел.
     * Прочитать записанный файл, вывести на экран числа и их среднее арифметическое.
     */

    public static void main(String[] args) throws IOException {

        byte [] arr = new byte[20];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (byte)(Math.random()*100);
        }
        System.out.println("То, что записываем в файл: " + Arrays.toString(arr));

        DataOutputStream dos = new DataOutputStream(new FileOutputStream("Borysenka_Aksana\\src\\main\\resources\\ForTask49.txt"));
        try {
            dos.write(arr);
            dos.flush();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
                dos.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        List<Integer> lst = new ArrayList<>();
        int sum = 0;

        try(DataInputStream dis = new DataInputStream(new FileInputStream("Borysenka_Aksana\\src\\main\\resources\\ForTask49.txt"))) {
            do {
                lst.add(dis.read());
            }while(dis.available()>0);
        }catch(IOException e){
            e.printStackTrace();
        }

        for(int i = 0; i<lst.size(); i++){
            sum += lst.get(i);
        }
        System.out.println("То, что читаем из файла: " + lst +"\n"+ "Среднее арифметическое: " + sum/2);

    }
}
