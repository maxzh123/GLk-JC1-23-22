package by.itAcademy.homeworks.operators;

/**
 * ## Задание 8
 * > Задать целое число в виде переменной, это число – сумма денег в рублях.
 * > Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже
 */

public class Task8 {
    public int sumRub;

    public String getSumRub(int sumRub) {
        setSumaRubley(sumRub);
        setSumRub(sumRub);
        return this.rubley;
    }

    public void setSumaRubley(int sumRub) {
        this.sumRub = sumRub;
    }

    public void setSumRub(int sumRub) {
        if (sumRub % 10 == 1) {
            if (sumRub == 11) {
                getRubley();
            } else {
                getRubl();
            }
        } else if (sumRub % 10 == 2 || sumRub % 10 == 3 || sumRub % 10 == 4) {
            if (sumRub >= 12 && sumRub <= 14) {
                getRubley();
            } else {
                getRubly();
            }
        } else {
            getRubley();
        }

    }

    public void getRubly() {
        setRubly();
    }

    public void setRubly() {
        String rubley = "рубля";
        System.out.println(sumRub + " " + rubley);
        this.rubley = rubley;
    }

    public void getRubley() {
        setRubley();
    }

    public void setRubley() {
        String rubley = "рублей";
        System.out.println(sumRub + " " + rubley);
        this.rubley = rubley;
    }

    public void getRubl() {
        setRubl();
    }

    public void setRubl() {
        String rubley = "рубль";
        System.out.println(sumRub + " " + rubley);
        this.rubley = rubley;
    }

    private String rubley = "руб";

}
