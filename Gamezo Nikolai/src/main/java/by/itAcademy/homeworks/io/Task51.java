package by.itAcademy.homeworks.io;

import java.io.*;

/**
 * Задание 51
 * Создать объект Person c полями name, surname, age.
 * Сгенерировать 10 объектов класса Person со случайными полями соответствующего типа.
 * С помощью Java создать файл, в который запишется информация о этих людях.
 */

public class Task51 {
    public static void main(String[] args) throws IOException {
        File file = new File("Gamezo Nikolai\\src\\main\\resources\\ForTask51");
        file.createNewFile();
        try (FileWriter writer = new FileWriter("Gamezo Nikolai\\src\\main\\resources\\ForTask51", false)) {
            writer.write("");
            writer.flush();
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        createAndWrite(new Person("Vlad","Surname1",25));
        createAndWrite(new Person("Artur","Surname2",26));
        createAndWrite(new Person("Aksana","Surname3",27));
        createAndWrite(new Person("Ura","Surname4",28));
        createAndWrite(new Person("Denis","Surname5",29));
        createAndWrite(new Person("Nikolai","Surname6",30));
        createAndWrite(new Person("Aliaksandr","Surname7",31));
        createAndWrite(new Person("Aliaksei","Surname8",32));
        createAndWrite(new Person("Lyesha","Surname9",33));
        createAndWrite(new Person("Alexander","Surname10",34));
    }
    public static void createAndWrite(Person person) throws IOException {
        try (FileWriter writer = new FileWriter("Gamezo Nikolai\\src\\main\\resources\\ForTask51", true)) {
            writer.write(person.toString());
            writer.flush();
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
