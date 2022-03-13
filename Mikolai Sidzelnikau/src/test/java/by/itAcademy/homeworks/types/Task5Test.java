package by.itAcademy.homeworks.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Task5Test {
    public Task5 task5 = new Task5();

    public static void main(String[] args) {
        Task5 task5 = new Task5();
        int sum = 4840;
        task5.getSum(sum);
        System.out.println(task5.getHour() + " часов " + task5.getMin() + " минут " + task5.getSec() + " секунд");
    }

    @Test
    void test1GetSec() {
        task5.getSum(3700);
        Assertions.assertEquals(40, task5.getSec());
    }

    @Test
    void test2GetMin() {
        task5.getSum(3700);
        Assertions.assertEquals(1, task5.getMin());
    }

    @Test
    void test3GetHour() {
        task5.getSum(3700);
        Assertions.assertEquals(1, task5.getHour());
    }
}