package by.itAcademy.homeworks.patterns;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static synchronized Logger getLogger(){
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void write(String txt){
        String PATH = "Korotkevich Lyesha/src/main/resources/Task69";
        try(BufferedWriter output = new BufferedWriter(new FileWriter(PATH, true))){
            output.write(txt);
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
