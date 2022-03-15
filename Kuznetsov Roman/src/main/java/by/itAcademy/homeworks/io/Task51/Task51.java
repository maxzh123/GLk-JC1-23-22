package by.itAcademy.homeworks.io.Task51;

import java.io.*;

public class Task51 {

    private static final String path = String.valueOf(Task51.class.getResourceAsStream("itAcademy\\homeworks\\io\\Objects.txt"));
    public static void main(String[] args) {
        Person[] people = new Person[10];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person();
        }
        writeObjectToFile(people);
        readObjectFromFile();
        for (Person person : people)
            System.out.println(person.toString());
    }
    public static void writeObjectToFile(Person[] people) {
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            for (int i = 0; i < people.length; i++) {
                oos.writeObject(people);
            }
           oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Person[] readObjectFromFile() {
        Person[] result = null;
        try{
            ObjectInputStream oos = new ObjectInputStream (new FileInputStream(path));
            result = (Person[]) oos.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
