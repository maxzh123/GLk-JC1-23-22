package by.itAcademy.homeworks.io;

import java.io.*;

/**
 * Задание 49
 * Записать с помощью Java в двоичный файл 20 случайных чисел.
 * Прочитать записанный файл, вывести на экран числа и их среднее арифметическое.
 */

public class Task49 {
    public static void main(String[] args) throws FileNotFoundException {
        DataOutputStream output;
        try{
            output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Gamezo Nikolai\\src\\main\\resources\\ForTask49")));
            for (int i = 0; i < 20; i++) {
                output.writeInt((int) (Math.random()*100));
            }
            output.flush();
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
