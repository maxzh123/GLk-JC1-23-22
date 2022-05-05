package by.itAcademy.homeworks.threads;

import java.util.ArrayList;

/**
 * Задание 53
 * Создать класс поток, который генерирует массив случайных целых чисел из 10 элементов,
 * затем находит максимальный элемент, в этом массиве, и выводит на экран в формате имя потока, максимальный элемент. Запустить 10 потоков.
 */

public class Task53 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread t = new Thread (new FindMax ());
            t.setName("Поток " + i);
            t.start();
        }
    }
    public static class FindMax implements  Runnable {
        @Override
        public void run() {
            ArrayList<Integer> array= new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                array.add((int) (Math.random() * 100));
            }
            int max = array.get(0);
            for (int i = 0; i < array.size(); i++) {
                if (max < array.get(i)) {
                    max = array.get(i);
                }
            }
            System.out.println(Thread.currentThread().getName() + " завершён, результат: " + max);
        }
    }
}
