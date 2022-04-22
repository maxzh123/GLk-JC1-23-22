package by.itAcademy.homeworks.generics;

import java.util.Scanner;

public class Car extends Vehicle{

    public Car() {
        super();
    }

    public String scanerName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите наименование автомобиля");
        return sc.nextLine();
    }

    @Override
    public String toString() {
        return "Car{" +
                "name = "  + scanerName() +
                '}';
    }
}
