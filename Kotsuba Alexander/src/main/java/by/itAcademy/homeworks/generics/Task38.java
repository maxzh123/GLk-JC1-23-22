/*Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle.
Создать поле name в классе Vehicle и проинициализировать его через конструктора.
Создать generic класс Garage, который может хранить только объекты типа наследуемого от Vehicle.
Создать 2 объекта класса Garage (все поля ввести с клавиатуры) и вывести на экран имя хранимого транспортного средства.*/
package by.itAcademy.homeworks.generics;

public class Task38 {
    public static void main(String[] args) {
        Garage<Vehicle> garage1 = new Garage<>();
        Garage<Vehicle>garage2 = new Garage<>();
        garage1.addVehicle(new Car("Kia","Rio"));
        garage2.addVehicle(new Car("Kia","Sportage"));
        System.out.println(garage1);
        System.out.println(garage2);
    }
}
