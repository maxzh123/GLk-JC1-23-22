package by.itAcademy.homeworks.MyTask;

import java.util.List;

public class Car {
    public String name;
    public int engineСapacity;
    CarModel carModel;

    public enum CarModel {
        MAZ,
        BELAZ,
        GEELY
    }

    public Car(String name, int engineСapacity, CarModel carModel) {
        this.name = name;
        this.engineСapacity = engineСapacity;
        this.carModel = carModel;
    }

    public int getEngineCapacity() {
        return engineСapacity;
    }

    public String toString() {
        return name + " " + carModel + " " + engineСapacity+ " " ;
    }
}