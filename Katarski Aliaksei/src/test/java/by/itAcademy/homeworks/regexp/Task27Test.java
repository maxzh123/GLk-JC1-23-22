package by.itAcademy.homeworks.regexp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task27Test {

    @Test
    void numOfWords() {
        int expRes=14;
        String string="Ввести текст посчитать количество слов в тексте.Учитывать что между словами могуть быть пробелы";
        Assertions.assertEquals(expRes,Task27.numOfWords(string));
    }
}