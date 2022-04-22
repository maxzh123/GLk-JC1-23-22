/*Написать код, который выбрасывает NullPointerException.
Написать обработчик этого исключения и вывести на экран сообщение, которое будет содержать описание данного исключения.*/

package by.itAcademy.homeworks.exceptions;

import java.util.ArrayList;

public class Task43 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Петя");
        names.add("Вася");
        names.add(null);

        try {
            namesEq(names);
        }catch (NullPointerException e){
            System.out.println("Вы сравнили несравнимое");
        }
    }

    public static void namesEq(ArrayList<String> list) throws NullPointerException{
        for(String s : list){
            System.out.println(s.equals("Петя"));
        }
    }
}
