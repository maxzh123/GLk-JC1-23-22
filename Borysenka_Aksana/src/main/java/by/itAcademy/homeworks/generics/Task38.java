package by.itAcademy.homeworks.generics;

import by.itAcademy.homeworks.helper.strScanner;

public class Task38 {

    /**Task38
     * Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle.
     * Создать поле name в классе Vehicle и проинициализировать его через конструктора.
     * Создать generic класс Garage, который может хранить только объекты типа наследуемого от Vehicle.
     * Создать 2 объекта класса Garage (все поля ввести с клавиатуры) и вывести на экран имя хранимого транспортного средства.
     */

    public static void main(String[] args) {

    Garage<Car> garageForCar = new Garage<>();
    Garage<Motorcycle> garageForMotorcycle = new Garage<>();

    garageForCar.putInto(new Car());
    garageForMotorcycle.putInto(new Motorcycle());

    System.out.println(garageForCar.qetFrom() + "\n" + garageForMotorcycle.qetFrom());

    }

}
