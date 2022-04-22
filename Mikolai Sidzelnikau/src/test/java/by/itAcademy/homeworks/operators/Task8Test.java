package by.itAcademy.homeworks.operators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task8Test {
    public Task8 task8 = new Task8();
    @Test
    void test1(){
        int s = 1;
        Assertions.assertEquals("рубль",task8.getSumRub(s));
    }
    @Test
    void test2(){
        int s = 11;
        Assertions.assertEquals("рублей",task8.getSumRub(s));
    }
    @Test
    void test3(){
        int s = 12;
        Assertions.assertEquals("рублей",task8.getSumRub(s));
    }
    @Test
    void test4(){
        int s = 22;
        Assertions.assertEquals("рубля",task8.getSumRub(s));
    }
    @Test
    void test5(){
        int s = 55;
        Assertions.assertEquals("рублей",task8.getSumRub(s));
    }

    public static void main(String[] args) {
        Task8 task8 = new Task8();
        int r = 1000;
        task8.getSumRub(r);

    }
}