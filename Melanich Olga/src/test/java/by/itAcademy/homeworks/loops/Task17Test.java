package by.itAcademy.homeworks.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task17Test {

    @Test
    void accountingNumberFormatPlus() {
        String expected = "198 546 675 ";
        String actual = Task17.accountingNumberFormatPlus(198546675);
        assertEquals(expected, actual);
    }

    @Test
    void accountingNumberFormatPlus1() {
        String expected = "1 000 ";
        String actual = Task17.accountingNumberFormatPlus(-1000);
        assertNotEquals(expected, actual);
    }


    @Test
    void accountingNumberFormatMinus() {
        String expected = "-24 890 ";
        String actual = Task17.accountingNumberFormatMinus(-24890);
        assertEquals(expected, actual);
    }

    @Test
    void accountingNumberFormatMinus1() {
        String expected = "-30 000 ";
        String actual = Task17.accountingNumberFormatMinus(30000);
        assertNotEquals(expected, actual);
    }
}