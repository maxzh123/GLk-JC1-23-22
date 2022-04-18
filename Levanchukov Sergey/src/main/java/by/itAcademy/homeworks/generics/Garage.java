package by.itAcademy.homeworks.generics;

import java.util.List;
import java.util.Scanner;

public class Garage <T extends Vehicle>{

    private T vehicle;

    public void putInfo(T o){
        System.out.println("Гараж для " +o);
    }

}
