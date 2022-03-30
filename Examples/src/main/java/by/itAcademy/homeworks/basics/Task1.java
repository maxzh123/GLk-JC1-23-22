package by.itAcademy.homeworks.basics;

import by.itAcademy.interfaces.basics.ITask1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Task1 implements ITask1 {

    public static void main(String[] args) {
        System.out.println("Hello word");

        try {
            InputStream i=new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Все еще работаю");
        //throw new RuntimeException("Ашыпка!");

    }
}
