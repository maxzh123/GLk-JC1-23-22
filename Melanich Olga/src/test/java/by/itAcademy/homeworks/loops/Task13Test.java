package by.itAcademy.homeworks.loops;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

class Task13Test {

    @Test
    void calculateProductOfNumbersTest() {
        BigInteger expectedResult0 = new BigInteger("0");
        BigInteger expectedResult1 = new BigInteger("20160");

        BigInteger actualResult0 = Task13.calculateProductOfNumbers(0, 25);
        BigInteger actualResult1 = Task13.calculateProductOfNumbers(3, 8);

        assertEquals(expectedResult0, actualResult0);
        assertEquals(expectedResult1, actualResult1);



    }
}