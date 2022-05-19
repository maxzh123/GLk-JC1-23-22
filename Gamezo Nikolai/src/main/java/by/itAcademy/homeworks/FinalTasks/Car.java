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

    public Car(String name, int engineCapacity, CarModel carModel) {
        this.name = name;
        this.engineCapacity = engineCapacity;
        this.carModel = carModel;
    }

    public String getName() {
        return name;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }
    @Override
    public String toString() {
        return "<" + name + "> : <" + carModel + "> : " + engineCapacity;
    }
}


