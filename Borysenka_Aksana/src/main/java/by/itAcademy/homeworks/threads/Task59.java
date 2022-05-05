package by.itAcademy.homeworks.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Task59 {

    /**Task59
     * Создать задачу Callable, которая генерирует коллекцию из 10 рандомных целых чисел ->
     * засыпает произвольно на 1-10 секунд, результат выполнения – сумму этих чисел в виде строки.
     * Запустить 10 задач параллельно в пуле из 3 потоков. Вывести ход программы на экран с указанием имени потока,
     * который выполняет работу.
     */

    public static void main(String[] args) {
        int countNumbersOfCollection = 10;
        int numbersOfTasks = 10;
        //Получаем ExecutorService из служебного класса Executors размер пула потоков равен 3
        ExecutorService executor = Executors.newFixedThreadPool(3);
        //создаем список для хранения объекта Future, связанного с Callable
        List<Future> list = new ArrayList<Future>();
        Callable callable = new MyCallableForTask59(countNumbersOfCollection);
        for (int i = 0; i < numbersOfTasks; i++){
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
