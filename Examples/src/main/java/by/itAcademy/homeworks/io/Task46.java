package by.itAcademy.homeworks.io;

import java.io.*;

public class Task46 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        ObjectOutput oo=new ObjectOutputStream(new FileOutputStream("Examples/src/main/resources/persons.txt"));
//        oo.writeObject(new Person(18,"Василий"));
//        oo.writeObject(new Person(19,"Ольга"));
//        oo.writeObject(new Person(20,"Алексей"));
//        oo.flush();
//        oo.close();

                Person p=null;
                InputStream is=new FileInputStream("Examples/src/main/resources/persons.txt");
                ObjectInput oi=new ObjectInputStream(is);
                do{
                    p=(Person)oi.readObject();
                    System.out.println(p);
                }while(is.available()>0);
        oi.close();
        is.close();



    }
}
