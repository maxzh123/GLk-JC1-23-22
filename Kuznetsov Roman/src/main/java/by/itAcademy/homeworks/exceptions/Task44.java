package by.itAcademy.homeworks.exceptions;

import java.util.Scanner;

class BebraException extends Exception{
    public BebraException(String message) {
        super(message);
    }
}
public class Task44 {
    public static void main(String[] args) {
        try{
            throw new BebraException("Что-то тут пошло не так");
        }
        catch (BebraException e){
            e.printStackTrace();
        }
    }
}
