package by.itAcademy.homeworks.io;

import java.io.*;

public class Task47 {

    /**Task47
     * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
     * Вывести результат на экран.
     */

    public static void main(String[] args) throws IOException {
        Reader r = new BufferedReader(new FileReader("Borysenka_Aksana\\src\\main\\resources\\ForTask47.txt.txt"));
        do{
            System.out.print((char)r.read());
        }while (r.ready());
    }

}
