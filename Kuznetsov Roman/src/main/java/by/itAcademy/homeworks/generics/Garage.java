package by.itAcademy.homeworks.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Garage<T extends Vehicle> {

    private List<T> vehicles = new ArrayList<T>();

    public Garage(T... vehicles) {
        this.vehicles.addAll(Arrays.asList(vehicles));
    }


    public void addVehicle(T... vehicles){
        this.vehicles.addAll(Arrays.asList(vehicles));
    }
    public String getAllVehicles(){
        StringBuilder result = new StringBuilder();
        for (T vehicle:vehicles) {
            result.append(vehicle.toString()).append("\n");
        }
        return result.toString();
    }
}
