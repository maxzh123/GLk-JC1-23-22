package by.itAcademy.homeworks.regexp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
## Задание 26
        > Введите с клавиатуры строку. Найти в строке не только запятые, но и другие
        > знаки препинания. Подсчитать общее их количество.*/
public class Task26 {
    public static void main(String[] args) {
        int sum = 0;
        String s = "Жeнa мужу:\n" +
                "— У тeбя., нa \"пиджaкe\" ('coвceм') нeт вoлoc!\n" +
                "— И чтo?\n" +
                "— Kтo oнa, этa лыcaя мрaзь? Nina,anna ?";
        Pattern pattern = Pattern.compile("[^А-Яа-яЁё\\w\\s]{1,2}");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            sum++;
            System.out.print(matcher.group()+" ");
        }
        System.out.println();
        System.out.println("Знаков препинания = "+sum);
    }
}
