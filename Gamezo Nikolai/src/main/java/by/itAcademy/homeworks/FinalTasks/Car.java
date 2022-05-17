package by.itAcademy.homeworks.FinalTasks;

public class Car {
    public  String name;
    public int engineCapacity;
    CarModel carModel;

    public enum CarModel {
        RENAULT,
        MERCEDES,
        BMW
    }
    public Car(String name, int engineCapacity,CarModel carModel) {
        this.name = name;
        this.engineCapacity = engineCapacity;
        this.carModel = carModel;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }
    public String getName() {
        return name;
    }
    public String toString(){
        return name + " " + engineCapacity + " " + carModel;
    }
}

