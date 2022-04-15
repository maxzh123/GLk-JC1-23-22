package by.itAcademy.homeworks.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageTest {
    Garage<Car> test=new Garage<>();
    Garage<Motocycle> test_1=new Garage<>();

    @Test
    void getVehicle() {
        test.putVehicle(new Car("Mazda"));
        test_1.putVehicle(new Motocycle("Java 8"));
        Assertions.assertEquals("Mazda",test.getVehicle());
        Assertions.assertEquals("Java 8",test_1.getVehicle());
    }
}