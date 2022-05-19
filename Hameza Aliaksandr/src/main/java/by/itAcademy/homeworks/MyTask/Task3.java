package by.itAcademy.homeworks.MyTask;

import by.itAcademy.homeworks.MyTask.Car;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) throws IOException {
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Car1", 1, Car.CarModel.MAZ));
        cars.add(new Car("Car2", 2, Car.CarModel.MAZ));
        cars.add(new Car("Car3", 3, Car.CarModel.BELAZ));
        cars.add(new Car("Car4", 1, Car.CarModel.BELAZ));
        cars.add(new Car("Car5", 2, Car.CarModel.BELAZ));
        cars.add(new Car("Car6", 3, Car.CarModel.BELAZ));
        cars.add(new Car("Car7", 1, Car.CarModel.GEELY));
        cars.add(new Car("Car8", 2, Car.CarModel.GEELY));
        cars.add(new Car("Car9", 3, Car.CarModel.GEELY));
        cars.add(new Car("Car10", 1, Car.CarModel.GEELY));
        List Car1 = new ArrayList();
        List Car2 = new ArrayList();
        List Car3 = new ArrayList();
        for (Car car : cars) {
            if (car.getEngineCapacity() == 1) {
                Car1.add(car);
            }
            if (car.getEngineCapacity() == 2) {
                Car2.add(car);
            }
            if (car.getEngineCapacity() == 3) {
                Car3.add(car);
            }
        }
            Map<Integer,List<Car>> map = new HashMap<>();
            map.put(1, (List<Car>) Car1);
            map.put(2, (List<Car>) Car2);
            map.put(3, (List<Car>) Car3);
            File file = new File("Hameza Aliaksandr\\src\\main\\resources\\Task 3");
            file.createNewFile();
            try (FileWriter writer = new FileWriter("Hameza Aliaksandr\\src\\main\\resources\\Task 3", false)) {
                writer.write(String.valueOf(map.get(2)));
                writer.flush();
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }