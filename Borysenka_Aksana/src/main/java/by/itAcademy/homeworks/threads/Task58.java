package by.itAcademy.homeworks.threads;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;

public class Task58 {

    /**
     * Task58
     * Создать задачу Callable, которая генерирует 10 файлов с 10 произвольными строками ->
     * засыпает произвольно на 1-3 секунды, результат выполнения – коллекция имен файлов.
     * Запустить 10 задач параллельно в пуле из 3 потоков. Вывести ход программы на экран с указанием имени потока,
     * который выполняет работу.
     */

    public static void main(String[] args) {
        String path = "Borysenka_Aksana\\src\\main\\resources\\";
        int numberOfTasks = 10;
        //Получаем ExecutorService из служебного класса Executors размер пула потоков равен 3
        ExecutorService executor = Executors.newFixedThreadPool(3);
        //создаем список для хранения объекта Future, связанного с Callable
        List<Future> list = new ArrayList<Future>();
        Callable callable = new MyCallableForTask58(path);
        for (int i = 0; i < numberOfTasks; i++){
            Future future = executor.submit(callable);
            //добавив Future в список, мы можем получить возвращаемое значение
            list.add(future);
        }

        while(list.size()>0){
            Iterator<Future> i = list.iterator();
            while (i.hasNext()){
                Future f = i.next();
                if(f.isDone()){
                    try {
                        System.out.println(f.get());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                    i.remove();
                }
            }
        }
        //закрыть службу
        executor.shutdown();
    }
}








//        String path = "Borysenka_Aksana\\src\\main\\resources\\";
////        int numberOfFile = 10;
////        String prefixOfNameFile = "File_";
////        String fileExtension = ".txt";
////        path = createDirectory(path);
//        createTextFile(path);
////        for(int i = 1; i <= numberOfFile; i++) {
////            createTextFile(path + prefixOfNameFile + i + fileExtension);
////        }
//        System.out.println("ok");
//    }
////
////    public static String createDirectory(String path) {
////        path = path + "ForTask58\\";
////        File f = new File(path);
////        f.mkdirs();
////        return path;
////    }
//
//    public static void createTextFile(String path){
//        String str = "Hello";
//        int numberOfRows = 10;
//        int numberOfFile = 10;
//        String prefixOfNameFile = "File_";
//        String fileExtension = ".txt";
//
//        path = path + "ForTask58\\";
//        File f = new File(path);
//        f.mkdirs();
//
//        for (int j = 1; j <= numberOfFile; j++) {
//            try (BufferedWriter bf = new BufferedWriter(new FileWriter(path + prefixOfNameFile + j + fileExtension))) {
//                for (int i = 0; i < numberOfRows; i++) {
//                    bf.write(str);
//                    bf.newLine();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


