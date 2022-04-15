package by.itAcademy.homeworks.generics;

public class Garage <T extends Vehicle>{
    private T vehicle;

    public void putVehicle(T putVehicle){
        this.vehicle=putVehicle;
    }

    public String getVehicle(){
        System.out.println(vehicle.getName());
        return vehicle.getName();
    }
}

