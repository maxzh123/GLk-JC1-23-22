package by.itAcademy.homeworks.operators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task9Test {

@Test
void test1(){
    Task9 task9 = new Task9(15,3,2022);
    Assertions.assertEquals(16,task9.getDay());

}
    public static void main(String[] args) {
    Task9 task9 = new Task9(11,3,2022);
        System.out.println(task9.getCalendar());
    }
}