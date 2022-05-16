/*Создать класс поток, который генерирует массив случайных целых чисел из 10 элементов, затем находит максимальный элемент,
в этом массиве, и выводит на экран в формате имя потока, максимальный элемент.
Запустить 10 потоков.*/

package by.itAcademy.homeworks.threads;

class MassThread extends Thread{
    int elements = 10;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + maxElementArray(elements));
    }

    public int maxElementArray (int countElementArray) {
        int[] a = new int[countElementArray];
        int max = a[0];
        try {
            Array arr = new Array();
            arr.elementArr(a);
            for (int i = 0; i < a.length; i++) {
                if (a[i] >= max) {
                    max = a[i];
                }
            }
        }catch(NullPointerException npe){
            npe.printStackTrace();
        }
        return max;
    }
}


public class Task53 {
    public static void main(String[] args) throws InterruptedException {
        int countThread = 5;

        System.out.println("Go");
        for (int i = 1; i <= countThread; i++) {
            MassThread mt = new MassThread();
            mt.setName("Thread №" + i + " - ");
            mt.start();
        }

        System.out.println("End");
    }
}
