import by.itAcademy.homeworks.regexp.Task27;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test27 {
    @ParameterizedTest
    @CsvSource({"'Слова,не знаки препинания',4",
             "'Hello World!',2",
              "'Шла Саша по шоссе и сосала сушку',7",
                 "'Хочу работать в Гугле,но можно и в епаме',9"})
    void getWords(String text,int result){
        assertEquals(result,Task27.getWords(text));
    }
}
