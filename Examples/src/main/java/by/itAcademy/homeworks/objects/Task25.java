package by.itAcademy.homeworks.objects;

import java.util.Arrays;

import static by.itAcademy.homeworks.objects.C.work;

public class Task25 {
    public static void main(String[] args) {
        new Task25(28,4,2022);
        new Task25(4,2022);
        Task25 t=new Task25(2022);
        t.task(4,5,6,7,8,9);
        C c=new C();
        c.sayHello();
        work();
    }
    private final int day;
    private final int mon;
    private final int year;

    public Task25(int year) {
        this(1,year);
    }
    public Task25( int mon, int year) {
        this(1,mon,year);
    }

    public Task25(int day, int mon, int year) {
        this.day = day;
        this.mon = mon;
        this.year = year;
    }

    public void task() {
        task(1,2022);
    }

    public void task(int year) {
        task(1,year);
    }
    public void task( int mon, int year) {
        task(1,mon,year);
    }

    public void task(int day, int mon, int year) {
        System.out.println(String.format("%d %d %d",day,
                mon,
                year));
    }
    public void task(int... params) {
        System.out.println(Arrays.toString(params));
    }

}
