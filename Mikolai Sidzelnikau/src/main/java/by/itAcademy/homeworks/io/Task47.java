package by.itAcademy.homeworks.io;

import by.itAcademy.homeworks.io.countPunctuationWords.PatternPunctuationWords;
import by.itAcademy.homeworks.io.countPunctuationWords.ReadingReader;
import by.itAcademy.homeworks.io.countPunctuationWords.RecordWriter;
import java.io.*;


/** ## Задание 47
        > Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
        > препинания и слов. Вывести результат на экран.*/
public class Task47 {

    public static void main(String[] args) throws IOException {
        RecordWriter recordWriter = new RecordWriter();
        ReadingReader reader = new ReadingReader();
        Writer  writer = new FileWriter("Mikolai Sidzelnikau/src/main/resources/textSim_vol.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Mikolai Sidzelnikau/src/main/resources/textSim_vol.txt"));
        String sim ;
        recordWriter.getWriter(writer);
        reader.getBufferedReader(bufferedReader);
        sim = String.valueOf(reader.sim);
        PatternPunctuationWords p = new PatternPunctuationWords(sim);
        p.getPattern();
    }
}
