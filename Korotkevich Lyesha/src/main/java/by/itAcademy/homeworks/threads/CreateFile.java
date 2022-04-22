package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.io.Task51;

import java.io.*;
import java.util.ArrayList;

public class CreateFile implements Runnable{
    @Override
    public void run() {
        ArrayList<Integer> arr= new ArrayList<>(10);
        for (int i = 0; i < 10; i++){
            arr.add(Task51.generateInt(1, 100));
        }

        try (BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(new File("Korotkevich Lyesha/src/main/resources/Task54/"+Thread.currentThread().getName())))){
            for (int i: arr){
                output.write(i);
            }
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
