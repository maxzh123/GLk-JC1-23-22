package by.itAcademy.homeworks.threads;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class CallableForTask60 implements Callable {
    String path;
    String massage;

    public CallableForTask60(String path, String massage) {
        this.path = path;
        this.massage = massage;
    }

    @Override
    public String call() throws Exception {
        newWriteFile(path, massage);
        TimeUnit.SECONDS.sleep(1);
        return Thread.currentThread().getName();
    }

    public static synchronized void newWriteFile (String p, String m){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(p, true));
            bw.write(m + " recorded the message at " + LocalTime.now());
            bw.newLine();
            bw.flush();
            bw.close();
            System.out.println("File is written");
        }catch (IOException io){
            System.out.println("File is not written");
        }
    }
}
