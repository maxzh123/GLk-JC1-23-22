package by.itAcademy.homeworks.threads;

import java.util.Random;

public class ThreadHelper {
    public static int[] getRandArray(int length){
        int[] arrayForThread = new int[length];
        Random random = new Random();
        double temp=0;
        for (int j = 0; j < length; j++) {
            arrayForThread[j]=random.nextInt(100);
        }
        return arrayForThread;
    }
}
