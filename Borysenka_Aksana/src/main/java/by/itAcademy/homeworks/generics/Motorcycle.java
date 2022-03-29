package by.itAcademy.homeworks.generics;

import java.util.Scanner;

public class Motorcycle extends Vehicle{

    public Motorcycle() {
        super();
    }

    public String scanerName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите наименование мотоцикла");
        return sc.nextLine();
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name = " + scanerName() +
                '}';
    }
}
