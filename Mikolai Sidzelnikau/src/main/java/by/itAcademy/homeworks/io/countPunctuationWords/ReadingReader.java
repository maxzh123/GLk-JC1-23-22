package by.itAcademy.homeworks.io.countPunctuationWords;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingReader {
public List<String> sim = new ArrayList<>();
    public BufferedReader getBufferedReader(BufferedReader bufferedReader) {
        try {
            do {
                this.sim.add(bufferedReader.readLine());
            }while (bufferedReader.ready());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bufferedReader;
    }
}
