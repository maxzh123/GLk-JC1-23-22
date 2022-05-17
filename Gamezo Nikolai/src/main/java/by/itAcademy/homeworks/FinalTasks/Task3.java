package by.itAcademy.homeworks.FinalTasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Car car1 = new Car ("Car1", 1, Car.CarModel.RENAULT);
        Car car2 = new Car ("Car2", 2, Car.CarModel.RENAULT);
        Car car3 = new Car ("Car3", 3, Car.CarModel.RENAULT);
        Car car4 = new Car ("Car4", 1, Car.CarModel.RENAULT);
        Car car5 = new Car ("Car5", 2, Car.CarModel.MERCEDES);
        Car car6 = new Car ("Car6", 3, Car.CarModel.MERCEDES);
        Car car7 = new Car ("Car7", 1, Car.CarModel.MERCEDES);
        Car car8 = new Car ("Car8", 2, Car.CarModel.BMW);
        Car car9 = new Car ("Car9", 3, Car.CarModel.BMW);
        Car car10 = new Car ("Car10", 1, Car.CarModel.BMW);
        List Car = new ArrayList();
        Car.add(car1);
        Car.add(car2);
        Map<Integer, List<Car>> map = new HashMap<>();

        map.put(car1.getEngineCapacity(), (List<Car>) Car);

    }
}
