package by.itAcademy.homeworks.regexp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task28Test {

    @Test
    void lastCharText() {
        String a="Ввести с клавиатуры текст.";
        Assertions.assertEquals("исыт",Task28.lastCharText(a));
    }
}