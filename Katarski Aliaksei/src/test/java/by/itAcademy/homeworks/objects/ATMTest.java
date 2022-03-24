package by.itAcademy.homeworks.objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    ATM one = new ATM(0, 0, 0);

    @Test
    void add_20() {
        int sum = one.add_20(20);
        Assertions.assertEquals(20, sum);
    }


    @Test
    void add_50() {
        int sum1 = one.add_50(52);
        Assertions.assertEquals(52, sum1);
    }

    @Test
    void add_100() {
        int sum2 = one.add_100(1221);
        Assertions.assertEquals(1221, sum2);
    }

    @Test
    void getTotalMoney() {
        ATM two = new ATM(1, 12, 2);
        Assertions.assertEquals(820,two.getTotalMoney());
    }
}