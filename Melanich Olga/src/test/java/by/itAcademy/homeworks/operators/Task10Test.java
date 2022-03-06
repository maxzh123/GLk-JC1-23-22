package by.itAcademy.homeworks.operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    void checkLocationOfHouses() {

        boolean shouldBeTrue = Task10.isLocationOfHouses(5, 7, 6, 7, 7, 13);
        boolean shouldBeFalse = Task10.isLocationOfHouses(5, 7, 6, 7, 5, 13);

        assertTrue(shouldBeTrue);
        assertFalse(shouldBeFalse);
    }
}