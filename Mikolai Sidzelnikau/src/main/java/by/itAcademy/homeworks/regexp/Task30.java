package by.itAcademy.homeworks.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
## Задание 30
        > Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке
        > всех тегов абзацев, в том числе тех, у которых есть параметры, например, `<p
        > id=”p1”>`, и замену их на простые теги абзацев `<p>`. Результат работы метода
        > выведите на экран.*/
public class Task30 {
    public static void main(String[] args) {
        String s = "The TL431 and TL432 are three-terminal adjustable shunt regulators," +
                " <p> with specified thermal stability over applicable automotive, commercial,</p>" +
                "The TL431 and TL432 are three-terminal adjustable shunt regulators," +
                "<p> and military temperature ranges. The output voltage can be set to any value </p>" +
                "<p sd =\"p3\"> between Vref (approximately 2.5 V) and 36 V, with two external resistors (see Figure 17).</p>" +
                "<p>TL431 это регулируемый стабилизатор напряжения параллельного типа. Иначе его можно назвать</p>" +
                " «управляемым программируемым стабилитроном”. Предназначена она для применения в роли блока" +
                "<p sd =\"p3\"> опорного напряжения в различных вариациях схем устройств питания, и, также может служить</p>";
        Pattern pattern = Pattern.compile("(<p\\s\\w+\\s+\\=\\\"\\w+\\\">)|(<p\\s\\w+\\=\\\"\\w+\\\">)");
        Matcher matcher = pattern.matcher(s);
       String s1 = matcher.replaceAll("<p>");
       Pattern pattern1 = Pattern.compile("(<p>([\\,\"'=\\+\\-.;:?@#$%^&*()№+!\\s+\\w+А-Яа-яЁё+]+)?</p>)");
       Matcher matcher1 = pattern1.matcher(s1);
        while (matcher1.find()){
            System.out.println(matcher1.group());
        }
    }

}
