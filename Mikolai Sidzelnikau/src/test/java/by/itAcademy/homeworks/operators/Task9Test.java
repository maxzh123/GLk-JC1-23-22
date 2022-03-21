package by.itAcademy.homeworks.operators;

import by.itAcademy.homeworks.superSila.SuperSilaYear;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task9Test {

    @Test
    void test1() {
        Task9 task9 = new Task9(31, 7, 2022);
        Assertions.assertEquals(1, task9.getDay());
    }

    @Test
    void test2() {
        Task9 task9 = new Task9(28, 2, 2022);
        Assertions.assertEquals(1, task9.getDay());
    }

    @Test
    void test3() {
        Task9 task9 = new Task9(30, 6, 2022);
        Assertions.assertEquals(1, task9.getDay());
    }

    @Test
    void test4() {
        Task9 task9 = new Task9(22, 6, 2022);
        Assertions.assertEquals(23, task9.getDay());
    }

    public static void main(String[] args) {
        Task9 task9 = new Task9(30, 6, 2022);
        task9.getNextDay();
        Task9 superSila = new SuperSilaYear(12,7,2022);
        superSila.getNextDay();
        SuperSilaYear superSila1 = new SuperSilaYear(7,7,2022);
        superSila1.getNextDay();
        System.out.println(superSila1.getSuperSila());
    }
}