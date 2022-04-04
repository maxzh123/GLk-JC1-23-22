package by.itAcademy.homeworks.oop.Task33;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PremiumCardTest {

    @Test
    void getCredit() {
        PremiumCard test=new PremiumCard("Alfa","I",111,"USD",0,12.12,500);
        Assertions.assertEquals(500,test.getCredit(Currency.BYN,500));
    }
}