package by.itAcademy.homeworks.oop.AdditionalProblem;

import by.itAcademy.homeworks.generics.Vehicle;

public class main {
    public static void main(String[] args) {
        Parking a = new Parking(3,new Person(), ParkingType.CLOSED, 10);
        a.parkVehicle(new Vehicle("bebra",4,"Fanat"));
        a.parkVehicle(new Vehicle("bebra",4,"Fanat"));
        a.parkVehicle(new Vehicle("bebra",4,"Fanat"));
        System.out.println(a.parkVehicle(new Vehicle("bebra",4,"Fanat")));
        System.out.println(a.getVehicleFromParking(0));
    }
}
