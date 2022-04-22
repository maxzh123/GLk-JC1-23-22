package by.itAcademy.homeworks.io;

import java.io.*;

public class Task51 {

    /**Task51
     * Создать объект Person c полями name, surname, age.
     * Сгенерировать 10 объектов класса Person со случайными полями соответствующего типа.
     * С помощью Java создать файл, в который запишется информация о этих людях.
     */

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutput oo = new ObjectOutputStream(new FileOutputStream("Borysenka_Aksana/src/main/resources/ForTask51.txt"));
        oo.writeObject(new Person("Petr", "Petrov", 10));
        oo.writeObject(new Person("Ivan", "Ivanov", 15));
        oo.writeObject(new Person("Olya", "G", 12));
        oo.writeObject(new Person("Alex", "A", 20));
        oo.writeObject(new Person("Artem", "W", 34));
        oo.writeObject(new Person("Maks", "A", 25));
        oo.writeObject(new Person("Srgey", "B", 40));
        oo.writeObject(new Person("Andrey", "C", 13));
        oo.writeObject(new Person("Vova", "O", 4));
        oo.writeObject(new Person("Misha", "Y", 19));
        oo.writeObject(new Person("Roma", "E", 30));
        oo.flush();
        oo.close();


        Person p = null;
        InputStream is = new FileInputStream("Borysenka_Aksana/src/main/resources/ForTask51.txt");
        ObjectInput oi = new ObjectInputStream(is);
        do{
            p = (Person)oi.readObject();
            System.out.println(p);
        }while(is.available()>0);
        oi.close();
        is.close();

    }
}
