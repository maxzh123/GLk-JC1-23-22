package by.itAcademy.homeworks.threads;

/**Создать класс поток, который генерирует массив случайных целых чисел из 10 элементов, затем находит максимальный элемент,
 * в этом массиве, и выводит на экран в формате имя потока, максимальный элемент. Запустить 10 потоков.
 */


public class Task53 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new Max());
            t.start();
        }
    }
}