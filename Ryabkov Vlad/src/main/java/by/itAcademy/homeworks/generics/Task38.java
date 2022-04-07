package by.itAcademy.homeworks.generics;

import by.itAcademy.homeworks.generics.Transport.Car;
import by.itAcademy.homeworks.generics.Transport.Garage;
import by.itAcademy.homeworks.generics.Transport.Moto;
import by.itAcademy.homeworks.generics.Transport.Vehicle;

public class Task38 {
    public static void main(String[] args) {
        Garage<Vehicle> garage1 = new Garage<>();
        Garage<Vehicle> garage2 = new Garage<>();
        garage1.addVehicle(new Car("Renault","Megane"));
        garage2.addVehicle(new Moto("Yamaha","R1"));
        System.out.println("В первом гараже : " + garage1);
        System.out.println("Во втором гараже : " + garage2);
    }
}
