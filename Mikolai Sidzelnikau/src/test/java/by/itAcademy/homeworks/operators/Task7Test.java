package by.itAcademy.homeworks.operators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task7Test {
    public Task7 task7 = new Task7();

    @Test
    void test1SetP() {
        int a = 5;
        int b = 12;
        task7.setP(a, b);
        Assertions.assertEquals(60, task7.getP(a, b));
    }

    @Test
    void test2SetpKrug() {
        int r = 6;
        task7.setpKrug(r);
        Assertions.assertEquals(113, task7.getpK(r));
    }

    @Test
    void test3() {
        int a = 2;
        int b = 6;
        int r = 2;
        task7.pRad(a, b, r);
        Assertions.assertTrue(task7.getB1());
    }

    public static void main(String[] args) {
        Task7 task7 = new Task7();
        int a = 12;
        int b = 26;
        int r = 10;
        task7.pRad(a, b, r);
    }
}