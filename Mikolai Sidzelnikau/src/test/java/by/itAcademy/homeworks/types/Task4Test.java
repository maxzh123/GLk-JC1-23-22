package by.itAcademy.homeworks.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class Task4Test {
    public static void main(String[] args) {
        Task4 task4 = new Task4();
        Scanner scanner = new Scanner(System.in);
        int sum1 = scanner.nextInt();
        int sum2 = scanner.nextInt();
        sum1 = task4.getSumirovanie(sum1, sum2);
        System.out.println(sum1);
    }

    @Test
    void test1() {
        Task4 task4 = new Task4();
        int r = 12;
        int b = 2;
        task4.setSumirovanie(r, b);
        Assertions.assertEquals(task4.sumirovanie, task4.getSumirovanie(r, b));
    }

    @Test
    void test2() {
        Task4 task4 = new Task4();
        int s = 12;
        int v = 2;
        Assertions.assertEquals(38, task4.getSumirovanie(s, v));
    }
}