package by.itAcademy.homeworks.patterns;

import java.io.IOException;

/**
 * Задание 69
 * Создайте простейший логгер, выводящий сообщения об ошибках в текстовый файл.
 * Объект логгера должен быть создан с помощью ШП Singleton.
 * У объекта должен быть обязательным один метод,
 * получающий на вход текст сообщения об ошибке и записывающий его в файл вместе с информацией о дате и времени происшествия.
 */

public class Task69 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger();
        Integer num = null;
        try {
            int x = num * 2;
        } catch (NullPointerException exc) {
            logger.writeLog(String.valueOf(exc));
        }
    }
}
