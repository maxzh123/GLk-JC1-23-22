package by.itAcademy.homeworks.generics;

//Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle.
//Создать поле name в классе Vehicle и проинициализировать его через конструктора.
//Создать generic класс Garage, который может хранить только объекты типа наследуемого от Vehicle.
//Создать 2 объекта класса Garage (все поля ввести с клавиатуры) и вывести на экран имя хранимого транспортного средства.

public class Task38 {
    public static void main(String[] args) {
        Garage<Car> car=new Garage<>();
        Garage<Motorcycle> motorcycle=new Garage<>();
        car.setItem(new Car("BMW"));
        motorcycle.setItem(new Motorcycle("Kawasaki"));
        System.out.println(car.getItem());
        System.out.println(motorcycle.getItem());
    }
}
