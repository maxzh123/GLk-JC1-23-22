package by.itAcademy.homeworks.operators;


/**
 * Задать целое число в виде переменной, это число – сумма денег в рублях.
 * Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже
 */

public class Task8 {
    public static void main(String[] args) {
    int rubNumber = (int)(Math.random()*20000- 10000);
        System.out.println(rubNumber);
        checkrubNumber(rubNumber);
    }

    public static void checkrubNumber(int rub) {
        if (rub < 0) {
            System.out.println("Error: enter correct number");
        } else if (rub % 10 == 1 && rub%100 == 1) {
            System.out.println(rub + " рубль");
        } else if (rub% 10 == 2 || rub%10 == 3 || rub%10 == 4 ) {
            System.out.println(rub + " рубля");
        } else
            System.out.println(rub + " рублей");
    }

}



