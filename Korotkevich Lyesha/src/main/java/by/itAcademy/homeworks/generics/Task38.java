package by.itAcademy.homeworks.generics;

/**Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle.
Создать поле name в классе Vehicle и проинициализировать его через конструктора.
Создать generic класс Garage, который может хранить только объекты типа наследуемого от Vehicle.
Создать 2 объекта класса Garage (все поля ввести с клавиатуры) и вывести на экран имя хранимого транспортного средства.*/

public class Task38 {
    public static void main(String[] args) {
        Garage<Vehicle> garage = new Garage<>();
        Car car = new Car("Молния Макуин", 30000);
        Motorcycle motorcycle = new Motorcycle("Трон", 15000);
        garage.park(car);
        garage.park(motorcycle);
        System.out.println(garage);
    }
}
