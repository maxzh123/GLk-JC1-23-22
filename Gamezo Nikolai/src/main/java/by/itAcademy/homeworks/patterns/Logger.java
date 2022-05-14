package by.itAcademy.homeworks.patterns;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance;
    private Logger() {
    }
    public static synchronized Logger getLogger() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    public void writeLog(String error) throws IOException {
        File file = new File("Gamezo Nikolai\\src\\main\\resources\\ForTask69");
        file.createNewFile();
        try (FileWriter writer = new FileWriter("Gamezo Nikolai\\src\\main\\resources\\ForTask69", true)) {
            writer.write("Error: " + error + " Happened in " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("\"d MMMM uuuu в HH:mm:ss")) +"\n");
            writer.flush();
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
