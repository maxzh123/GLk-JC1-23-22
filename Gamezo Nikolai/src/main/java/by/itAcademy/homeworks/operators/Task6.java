package by.itAcademy.homeworks.operators;

/**
    Создайте метод с одним целочисленным параметром. Метод должен определить, является ли последняя цифра числа семеркой и вернуть boolean значение.
 */

public class Task6 {
    public static void main(String[] args) {
        int i = 101;
        boolean b=true;
        if (i % 10 == 7) {
            b=true;
        } else
            b=false;
        System.out.println(b);
    }
}
