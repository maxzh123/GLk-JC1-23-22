package by.itAcademy.homeworks.io;

import java.io.*;

/**
 *  Создать объект Person c полями name, surname, age. Сгенерировать 10
 * > объектов класса Person со случайными полями соответствующего типа. С помощью
 * > Java создать файл, в который запишется информация о этих людях.
 */

public class Task51 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try {
            ObjectOutput objectOutput=new ObjectOutputStream(new FileOutputStream("Katarski Aliaksei/src/main/resources/Persons.txt"));
            objectOutput.writeObject(new Person("Alex","Katar",26));
            objectOutput.writeObject(new Person("Vika","Vica",22));
            objectOutput.writeObject(new Person("Andrey","Ronaldo",16));
            objectOutput.writeObject(new Person("Olga","Seeva",26));
            objectOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Person p=null;
        InputStream is=new FileInputStream("Katarski Aliaksei/src/main/resources/Persons.txt");
        ObjectInput oj=new ObjectInputStream(is);
        do{
           p=(Person) oj.readObject();
           System.out.println(p);

    }while (is.available()>0);
        is.close();
        oj.close();
}
}