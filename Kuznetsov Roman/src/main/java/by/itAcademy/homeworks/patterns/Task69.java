package by.itAcademy.homeworks.patterns;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
class Logger{
    private static Logger instance;
    private Logger() {
    };
    public static Logger getInstance(){
        if(instance==null){
            instance = new Logger();
        }
        return instance;
    }
    public void logError(String errorDescription){
        try {
            FileWriter fileWriter = new FileWriter("log.txt", true);
            fileWriter.write("Error: "+errorDescription+" "+ LocalDateTime.now()+"\n");
            fileWriter.close();
            fileWriter.flush();
        } catch (IOException ignored) {
           //У него нету права голоса.
        }
    }
}
public class Task69 {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        for (int i = 0; i < 1000; i++) { //Симулируем долгую работу
        try {
            throw new IOException();//Прокидываем ошибку
        }
        catch (Exception e){
            logger.logError(e.getMessage());//Логгируем ошибку
        }
        }
    }
}
