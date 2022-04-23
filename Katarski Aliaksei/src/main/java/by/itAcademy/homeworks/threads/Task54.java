package by.itAcademy.homeworks.threads;


import java.io.*;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 *  Создать класс поток, который создает средствами Java файл и записать в него
 * > произвольно сгенерированный массив из 10 случайных целых чисел. Запустить 5
 * > потоков.
 */

class Thread_1 implements Runnable, Serializable{
    private static final long serialVersionUID = 1L;
    public int[] arrayWithRandomElement(){
        int[] arrayRandomEl=new int[10];
        for(int i=0;i<arrayRandomEl.length;i++){
            arrayRandomEl[i]=((int)(Math.random()*100));
        }
        return arrayRandomEl;
    }
    public void createFile(int[] arrayRand) throws IOException {
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("Katarski Aliaksei/src/main/resources/ForTask54.txt",true));
        try {
            bufferedWriter.write(Arrays.toString(arrayRand)+"\n");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            bufferedWriter.close();
//            bufferedWriter.flush(); ?? разве flush закрывает поток?
        }
    }
    @Override
    public void run() {
        try {
            createFile(arrayWithRandomElement());
            System.out.println(Thread.currentThread().getName() + " is working now");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
public class Task54 {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        for(int i=1;i<20;i++){
            executorService.submit(new Thread_1());
        }
        executorService.shutdown();
    }
}
