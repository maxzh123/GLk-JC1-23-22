package by.itAcademy.homeworks.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**Создать объект Person c полями name, surname, age. Сгенерировать 10 объектов класса Person со случайными полями соответствующего типа.
С помощью Java создать файл, в который запишется информация о этих людях.*/

public class Task51 {
    public static final char[] LETTERS = "ABCDEFGHIKLMNOPQRSTVXYZ".toLowerCase().toCharArray();

    public static void main(String[] args) {
        Person[] people = new Person[10];
        for (int i = 0; i < people.length; i++){
            people[i] = new Person(generateString(8), generateString(10), generateInt(1, 100));
        }
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Korotkevich Lyesha/src/main/resources/Task51.bin"))) {
            output.writeObject(people);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static char generateLetter(){
        return LETTERS[(int)(Math.random()*LETTERS.length)];
    }

    public static int generateInt(int min, int max){
        return (int)(Math.random()*(max - min));
    }

    public static String generateString(int n){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++){
            result.append(generateLetter());
        }
        return result.toString();
    }
}
