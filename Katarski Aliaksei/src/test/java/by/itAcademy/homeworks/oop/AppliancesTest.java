package by.itAcademy.homeworks.oop;

import by.itAcademy.homeworks.oop.Task32.Fridge;
import by.itAcademy.homeworks.oop.Task32.Teapot;
import by.itAcademy.homeworks.oop.Task32.Washer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppliancesTest {
    Teapot test_1=new Teapot("Huawei","White",123,"1 литр");
    Fridge test_2=new Fridge("LG","Black",4441,80);
    Washer test_3=new Washer("OOP","Blue",11,1400);
    @Test
    void getManufacturer() {
        Assertions.assertEquals("Huawei",test_1.getManufacturer());
    }

    @Test
    void getColor() {
        Assertions.assertEquals("White",test_1.getColor());
    }

    @Test
    void getSerialnumber() {
        Assertions.assertEquals(123,test_1.getSerialnumber());
    }
    @Test
    void getVolume(){
        Assertions.assertEquals("1 литр",test_1.getVolume());
    }
    @Test
    void getToWork(){
        String expRes_1="Храню продукты";
        String expRes_2="Кипячу воду";
        String expRes_3="Стираю";
        Assertions.assertEquals(expRes_1,test_2.getToWork());
        Assertions.assertEquals(expRes_2,test_1.getToWork());
        Assertions.assertEquals(expRes_3,test_3.getToWork());
    }
}