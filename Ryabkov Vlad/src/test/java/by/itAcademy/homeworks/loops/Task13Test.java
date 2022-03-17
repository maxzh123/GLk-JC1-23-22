package by.itAcademy.homeworks.loops;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task13Test {

    @Test
    void multiplerTest() {
        BigInteger expectResult = new BigInteger("0");
        BigInteger expectResult1 = new BigInteger("20160");

        BigInteger actualResult = Task13.multipler(0, 25);
        BigInteger actualResult1 = Task13.multipler(3, 8);

        assertEquals(expectResult, actualResult );
        assertEquals(expectResult1, actualResult1);
    }
}