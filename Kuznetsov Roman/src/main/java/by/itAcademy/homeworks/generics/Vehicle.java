package by.itAcademy.homeworks.generics;

public class Vehicle extends Garage {
    private String name;
    private int wheels;
    private String Producer;
    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public String getProducer() {
        return Producer;
    }
    public Vehicle(String name, int wheels, String producer) {
        this.name = name;
        this.wheels = wheels;
        Producer = producer;
    }
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", wheels=" + wheels +
                ", Producer='" + Producer + '\'';
    }
}
