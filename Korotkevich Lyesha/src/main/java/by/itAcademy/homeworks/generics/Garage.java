package by.itAcademy.homeworks.generics;

import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Vehicle> {
    private List<T> vehicles = new ArrayList<>();

    public void park(Vehicle o){
        vehicles.add((T) o);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "vehicles=" + vehicles +
                '}';
    }
}
