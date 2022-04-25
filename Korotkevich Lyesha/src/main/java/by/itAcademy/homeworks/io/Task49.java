package by.itAcademy.homeworks.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**Записать с помощью Java в двоичный файл 20 случайных чисел. Прочитать записанный файл, вывести на экран числа и их среднее арифметическое.*/

public class Task49 {
    public static void main(String[] args) throws IOException {
        DataOutputStream output;
        try {
            output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Korotkevich Lyesha/src/main/resources/Task49")));
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            return;
        }
        Random random = new Random();
        for (int i = 0; i < 20; i++){
            output.writeInt(random.nextInt());
        }

        output.flush();
        output.close();

        DataInputStream input = null;
        try {
            input = new DataInputStream(new BufferedInputStream(new FileInputStream("Korotkevich Lyesha/src/main/resources/Task49")));
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            return;
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true){
            try {
                int res = input.readInt();
                numbers.add(res);
            }catch (EOFException e){
                break;
            }
        }
        if (input != null){
            input.close();
        }
        System.out.println(numbers);
        int sum = 0;
        for (int el: numbers){
            sum+= el;
        }
        float sr = sum / numbers.size();
        System.out.println(sr);
    }
}
