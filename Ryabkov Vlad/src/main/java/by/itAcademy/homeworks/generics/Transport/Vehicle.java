package by.itAcademy.homeworks.generics.Transport;

/**
 * Создать классы Car и Motorcycle, которые наследуются от общего класса
 * Vehicle. Создать поле name в классе Vehicle и проинициализировать его через
 * конструктора. Создать generic класс Garage, который может хранить только объекты
 * типа наследуемого от Vehicle. Создать 2 объекта класса Garage (все поля ввести с
 *  клавиатуры) и вывести на экран имя хранимого транспортного средства.
 */
public class Vehicle {
    private String name;
    protected String brand,model;

    public String getName() {
        return name;
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public String description(){
        return brand + " " + model;
    }
}
