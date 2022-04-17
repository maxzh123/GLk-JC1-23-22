package by.itAcademy.homeworks.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**Создать объект Person c полями name, surname, age. Сгенерировать 10 объектов класса Person со случайными полями соответствующего типа.
С помощью Java создать файл, в который запишется информация о этих людях.*/

public class Task51 {
    public static void main(String[] args) {
        Person[] people = new Person[10];
        for (int i = 0; i < people.length; i++){
            people[i] = new Person(generateString(), generateString(), generateInt(100));
        }
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Korotkevich Lyesha/src/main/resources/Task51.bin"))) {
            output.writeObject(people);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int generateInt(int n){
        return (int)(Math.random()*n+1);
    }

    public static String generateString(){
        int n = generateInt(10);
        char[] letters = "ABCDEFGHIKLMNOPQRSTVXYZ".toLowerCase().toCharArray();
        char[] str = new char[n];
        for (int i = 0; i < n; i++){
            str[i] = letters[generateInt(23)-1];
        }
        return str.toString();
    }
}
