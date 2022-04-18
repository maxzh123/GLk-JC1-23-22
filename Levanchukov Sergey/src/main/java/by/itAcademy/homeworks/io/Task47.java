package by.itAcademy.homeworks.io;

import by.itAcademy.homeworks.io.ForTasksIO.FilesForTask;

import java.io.IOException;

/**
 * > Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
 * > препинания и слов. Вывести результат на экран.
 **/

public class Task47 {
    public static void main(String[] args) throws IOException {
        FilesForTask filesForTask = new FilesForTask();
        filesForTask.searchInLinePunct(filesForTask.listPrint());
        filesForTask.searchInLineWords(filesForTask.listPrint());
    }
}

