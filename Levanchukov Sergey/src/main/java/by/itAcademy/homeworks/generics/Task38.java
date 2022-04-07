package by.itAcademy.homeworks.generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * > Создать классы Car и Motorcycle, которые наследуются от общего класса
 * > Vehicle. Создать поле name в классе Vehicle и проинициализировать его через
 * > конструктора. Создать generic класс Garage, который может хранить только объекты
 * > типа наследуемого от Vehicle. Создать 2 объекта класса Garage (все поля ввести с
 * > клавиатуры) и вывести на экран имя хранимого транспортного средства.
 **/

public class Task38 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        Garage <Motorcycle> garageForMotorcycle=new Garage<>();
        try {
            garageForMotorcycle.putInfo(new Motorcycle(bf.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Garage<Car> garageForCar=new Garage<>();
        try {
            garageForCar.putInfo(new Car(bf.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        bf.close();
    }

}
