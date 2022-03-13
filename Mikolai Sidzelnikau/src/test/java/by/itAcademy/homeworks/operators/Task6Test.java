package by.itAcademy.homeworks.operators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task6Test {
public Task6 task6 = new Task6();
    @Test
    void test1SetNumbers() {
        int sum = 177;
        task6.setNumbers(sum);
        Assertions.assertEquals(7,task6.getNumbers());
    }

    @Test
    void test2SetaBoolean() {
        int sum = 177;
        task6.setNumbers(sum);
        Assertions.assertTrue(task6.getaBoolean());
    }

    public static void main(String[] args) {
        Task6 task6 = new Task6();
        int sum = 437;
        task6.setNumbers(sum);
        System.out.println(task6.getaBoolean());
    }
}