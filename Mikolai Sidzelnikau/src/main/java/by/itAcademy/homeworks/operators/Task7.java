package by.itAcademy.homeworks.operators;

/**
 * ## Задание 7
 * > Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
 * > Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже
 * > целое число).
 */

public class Task7 {
    private int p;

    public void pRad(int a, int b, int r) {
        getP(a, b);
        getpK(r);
        getB1();
    }

    public double getP(int a, int b) {
        setP(a, b);
        return p;
    }

    public void setP(int a, int b) {
        this.p = a * b;
    }

    public int getpK(int r) {
        setpKrug(r);
        return this.r = (int) pKrug;
    }

    public void setpKrug(int r) {
        this.pKrug = Math.PI * (r * r);
    }

    public boolean getB1() {
        setB1();
        return b1;
    }

    public void setB1() {
        boolean b1;
        b1 = !(pKrug < p);
        System.out.println(b1);
        this.b1 = b1;
    }

    public boolean b1 = true;
    private double pKrug;
    public int r ;

}
