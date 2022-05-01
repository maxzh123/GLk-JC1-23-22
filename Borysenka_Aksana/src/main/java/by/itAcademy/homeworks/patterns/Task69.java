package by.itAcademy.homeworks.patterns;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class MyLogger{
    private static MyLogger l;
    private final String logFilePath = "Borysenka_Aksana\\src\\main\\resources\\LoggerFile.txt";
    public static synchronized MyLogger getLogger(){
        if(l == null){
            l = new MyLogger();
        }
        return l;
    }

    private MyLogger(){}

    public void writeErrorDescription(Exception error){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(logFilePath, true));
            bw.write("The" + error + " happened in " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm:ss")) +"\n");
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}


public class Task69 {

    /**Task69
     * Создайте простейший логгер, выводящий сообщения об ошибках в текстовый файл.
     * Объект логгера должен быть создан с помощью ШП Singleton. У объекта должен быть обязательным один метод,
     * получающий на вход текст сообщения об ошибке и записывающий его в файл вместе с информацией о дате и времени происшествия.
     */

    public static void main(String[] args) {
        MyLogger logger = MyLogger.getLogger();
        int [] arr = new int [5];
        for (int i =0; i < 100; i ++) {
            try {
                arr[i] = i;
            }catch (Exception e){
                logger.writeErrorDescription(e);
            }
        }
    }
}
