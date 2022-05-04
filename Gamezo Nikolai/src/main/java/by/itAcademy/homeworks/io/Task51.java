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
        Person person1 = new Person("Vlad","Surname1",25);
        Person person2 = new Person("Artur","Surname2",26);
        Person person3 = new Person("Aksana","Surname3",27);
        Person person4 = new Person("Ura","Surname4",28);
        Person person5 = new Person("Denis","Surname5",29);
        Person person6 = new Person("Nikolai","Surname6",30);
        Person person7 = new Person("Aliaksandr","Surname7",31);
        Person person8 = new Person("Aliaksei","Surname8",32);
        Person person9 = new Person("Lyesha","Surname9",33);
        Person person10 = new Person("Alexander","Surname10",34);
        createAndWrite(person1);
    }
    public static void createAndWrite(Person person) throws IOException {
        try (FileWriter writer = new FileWriter("Gamezo Nikolai\\src\\main\\resources\\ForTask51", false)) {
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
