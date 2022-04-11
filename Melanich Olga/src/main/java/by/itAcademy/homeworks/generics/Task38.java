package by.itAcademy.homeworks.generics;

import java.util.Scanner;

/**
 * Задание 38
 * Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle.
 * Создать поле name в классе Vehicle и проинициализировать его через конструктора.
 * Создать generic класс Garage, который может хранить только объекты типа наследуемого от Vehicle.
 * Создать 2 объекта класса Garage (все поля ввести с клавиатуры) и вывести на экран имя хранимого транспортного средства.
 */
public class Task38 {
    public static void main(String[] args) {
        Garage<Car> garageForCar = new Garage<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Input a name: ");
        String carName = s.next();
        garageForCar.putInto(new Car(carName));
        System.out.println(garageForCar.getVehicle().toString());

        Garage<Motorcycle> garageForMotorcycle = new Garage<>();
        Scanner ss = new Scanner(System.in);
        System.out.println("Input a name: ");
        String motorcycleName = ss.next();
        garageForMotorcycle.putInto(new Motorcycle(motorcycleName));
        System.out.println(garageForMotorcycle.getVehicle());
    }
}
