package by.itAcademy.homeworks.generics;

import java.util.ArrayList;
import java.util.List;

public class Task38 {
    public static void main(String[] args) {
        Car car = new Car("Bebra-1000",4,"BebroProd");
        Car car2 = new Car("Bebra-3000",6,"Gachi");
        Motorcycle motorcycle = new Motorcycle("R1",2,"Yamaha");
        Motorcycle motorcycle2 = new Motorcycle("R1337",2,"Yamaha");
        Garage<Vehicle> garage = new Garage(car,car2,motorcycle,motorcycle2);
        System.out.println("Before adding vehicle");
        System.out.println(garage.getAllVehicles());
        System.out.println("After adding vehicle");
        garage.addVehicle(motorcycle);
        garage.addVehicle(motorcycle2);
        System.out.println(garage.getAllVehicles());
    }
}
