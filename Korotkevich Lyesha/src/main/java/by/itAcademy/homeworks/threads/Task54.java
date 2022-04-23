package by.itAcademy.homeworks.threads;

/**
 * Создать класс поток, который создает средствами Java файл и записать в него произвольно сгенерированный массив из 10 случайных
 * целых чисел. Запустить 5 потоков.
 */

public class Task54 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new CreateFile());
            t.start();
        }
    }
}
