package by.itAcademy.homeworks.threads;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Задание 54
 * Создать класс поток, который создает средствами Java файл и записать в него произвольно сгенерированный массив из 10 случайных целых чисел.
 * Запустить 5 потоков.
 */

public class Task54 {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread (new CreateAndWrite());
            t.setName("Thread " + i);
            t.start();
        }
    }
    public static class CreateAndWrite implements  Runnable {
        public void run() {
            ArrayList<Integer> array= new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                array.add((int) (Math.random() * 100));
            }
            try (FileWriter writer = new FileWriter("Gamezo Nikolai\\src\\main\\resources\\Task54\\" + Thread.currentThread().getName(), false)) {
                writer.write(array.toString());
                writer.flush();
            }
            catch (FileNotFoundException e) {
                System.out.println("Не удалось создать фаил");
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
