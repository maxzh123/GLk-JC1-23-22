package by.itAcademy.homeworks.exceptions;

import java.util.Date;

/**
 * > Написать код, который выбрасывает NullPointerException. Написать обработчик
 * > этого исключения и вывести на экран сообщение, которое будет содержать описание
 * > данного исключения.
 **/

public class Task43 {
    public static void main(String[] args) {

//        String nullPoint=null;
//
//        try {
//            System.out.println(nullPoint.length());
//        }
//        catch (Exception e){
//            System.out.println("Не-а!");
//        }

        try {
            throw new NullPointerException();
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        System.out.println("Не-а, дважды!");
    }
}
