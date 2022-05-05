package by.itAcademy.homeworks.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Task60 {

    /**Task60
     * Создать задачу Callable, которая берет сообщение “Hello World” + текущее время и записывает его в файл.
     * Запись в файл должна производиться последовательно через синхронизированный метод.
     * Запустить 10 задач параллельно в пуле из 3 потоков. Вывести ход программы на экран с указанием имени потока,
     * который выполняет работу.
     */

    public static void main(String[] args) {
        String path = "Borysenka_Aksana\\src\\main\\resources\\ForTask60.txt";
        String massage = "Hello World";
        int numberOfTasks = 10;
        //Получаем ExecutorService из служебного класса Executors размер пула потоков равен 3
        ExecutorService executor = Executors.newFixedThreadPool(3);
        //создаем список для хранения объекта Future, связанного с Callable
        List<Future> list = new ArrayList<Future>();
        Callable callable = new CallableForTask60(path, massage);
        for (int i = 0; i < numberOfTasks; i++){
            Future future = executor.submit(callable);
            //добавив Future в список, мы можем получить возвращаемое значение
            list.add(future);
        }
        for(Future f: list){
            try {
                // выводим возвращаемое значение Future, замечаем задержку вывода в консоли, потому что Future.get() ожидает завершения задачи
                System.out.println(f.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        //закрыть службу
        executor.shutdown();
    }
}
