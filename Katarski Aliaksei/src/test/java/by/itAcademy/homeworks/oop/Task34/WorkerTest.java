package by.itAcademy.homeworks.oop.Task34;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Loader test_1=new Loader("Aliaksei","Loader",800,Currency.BYN,120,130);
    PurshaseManager test_2=new PurshaseManager("Viktor","Manager",850,Currency.BYN,1350,2000,2.7);
    ITguy test_3=new ITguy("Oleg","It",875,Currency.USD,120,130,50);
    @Test
    void getName() {
        Assertions.assertEquals("Aliaksei",test_1.getName());
        Assertions.assertEquals("Viktor",test_2.getName());
        Assertions.assertEquals("Oleg",test_3.getName());
    }
    @Test
    void getPosition() {
        Assertions.assertEquals("Loader",test_1.getPosition());
        Assertions.assertEquals("Manager",test_2.getPosition());
        Assertions.assertEquals("It",test_3.getPosition());
    }
    @Test
    void getStartSalary() {
        Assertions.assertEquals(800,test_1.getStartSalary());
        Assertions.assertEquals(850,test_2.getStartSalary());
        Assertions.assertEquals(875,test_3.getStartSalary());
    }

    @Test
    void getSalaryCurrency() {
        Assertions.assertEquals(Currency.BYN,test_1.getSalaryCurrency());
        Assertions.assertEquals(Currency.BYN,test_2.getSalaryCurrency());
        Assertions.assertEquals(Currency.USD,test_3.getSalaryCurrency());
    }
    @Test
    void getSalary(){
        Assertions.assertEquals(800,test_1.getSalary());
        Assertions.assertEquals(2295,test_2.getSalary());
        Assertions.assertEquals(925,test_3.getSalary());
    }
}