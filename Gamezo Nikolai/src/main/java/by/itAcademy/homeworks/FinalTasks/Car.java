package by.itAcademy.homeworks.FinalTasks;

public class Car {
    public  String name;
    public int engineCapacity;
    CarModel ttt;
    public enum CarModel {
        RENAULT(""),
        MERCEDES(""),
        BMW("");
        private String description;
        CarModel(String description) {
            this.description = description;
        }
    }
    public Car(String name, int engineCapacity,CarModel ttt) {
        this.name = name;
        this.engineCapacity = engineCapacity;
        this.ttt=ttt;
    }
}

