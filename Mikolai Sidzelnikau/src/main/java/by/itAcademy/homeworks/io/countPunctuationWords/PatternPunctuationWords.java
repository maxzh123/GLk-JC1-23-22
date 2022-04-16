package by.itAcademy.homeworks.io.countPunctuationWords;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternPunctuationWords {

    private Pattern pattern;
    private String s;

    public PatternPunctuationWords(String s) {
        this.s = String.valueOf(s);
    }

    public int getPattern() {
        pattern = Pattern.compile("[A-Za-zА-Яа-яЁё]+");
        Matcher matcher = pattern.matcher(s);
        int suma = 0;
        while (matcher.find()){
            suma++;
        }
        pattern = Pattern.compile("[^A-Za-zА-Яа-яЁё0-9\\s]");
        Matcher matcher2 = pattern.matcher(s);
        int suma2 = 0;
        while (matcher2.find()){
            suma2++;
        }
        System.out.println("Количество слов = "+ suma+"\n Припенаний = "+suma2);
        return suma2;
    }
}
