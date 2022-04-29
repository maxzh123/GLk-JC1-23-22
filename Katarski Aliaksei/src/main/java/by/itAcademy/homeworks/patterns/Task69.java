package by.itAcademy.homeworks.patterns;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * > Создайте простейший логгер, выводящий сообщения об ошибках в текстовый
 * > файл. Объект логгера должен быть создан с помощью ШП Singleton. У объекта
 * > должен быть обязательным один метод, получающий на вход текст сообщения об
 * > ошибке и записывающий его в файл вместе с информацией о дате и времени
 * > происшествия.
 */
class Logger{
    private static Logger programLogger;
    private final String logFilePath="Katarski Aliaksei/src/main/resources/logFile";
    public static  synchronized Logger getLogger(){
        if(programLogger==null){
            programLogger=new Logger();
        }
        return programLogger;
    }
    private  Logger(){}
    public void writeErrorDescription(Exception error){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter(logFilePath,true));
            writer.write(error+" "+" Когда: "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm")) +"\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
public class Task69 {
    public static void main(String[] args) {
     Logger logger=Logger.getLogger();
     int[] array=new int[10];
     for(int i=0;i<=array.length;i++){
         try {
             array[11]=0;
         }catch (Exception e){
             logger.writeErrorDescription(e);

         }
     }
    }
}

