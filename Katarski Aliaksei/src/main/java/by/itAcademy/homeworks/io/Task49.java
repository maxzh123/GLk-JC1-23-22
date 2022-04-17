package by.itAcademy.homeworks.io;


import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * > Записать с помощью Java в двоичный файл 20 случайных чисел. Прочитать
 * > записанный файл, вывести на экран числа и их среднее арифметическое.
 */
public class Task49 {
    public static void main(String[] args) throws IOException {
        File file = new File("Katarski Aliaksei/src/main/resources/ForTask49.txt");
        List<Integer> list=readFile(file);
        writeFile(file);
        readFile(file);
        System.out.println(Arrays.toString(list.toArray()));
        average(list);

   }
   public static void writeFile(File file){
       try {
           DataOutputStream ds=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
           for(int i=0;i<=20;i++){
               ds.writeInt((int) (Math.random()*100));
           }
           ds.close();
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
    public static List<Integer> readFile(File file) {
        List<Integer> list = new ArrayList<>();
        try (DataInputStream dos = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            int res = dos.readInt();
            while (true) {
                list.add(res);
                try {
                    res = dos.readInt();
                } catch (EOFException e) {

                    break;
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static double average(List<Integer> list){
        int average=0;
        for(int i=0;i<list.size();i++){
            average+= list.get(i);
            average/=2;
        }
        System.out.println(average);
        return average;
    }
}




