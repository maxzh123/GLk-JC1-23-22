package by.itAcademy.homeworks.threads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class MyThread54  extends FileHandler implements Runnable{
    private final int[] arrayForThread;
    private static volatile int fileCounter;
    private File file;

    public MyThread54(int[] arrayForThread) throws IOException {
        super("File" + fileCounter + ".txt");
        this.arrayForThread = arrayForThread;
    }

    @Override
    public void run() {
        file = new File(getFilePath());
        System.out.print(Thread.currentThread().getName() + ": ");
        fileWrite(Arrays.toString(arrayForThread));
    }

    public static void goToNextFile() {
        fileCounter++;
    }
}
