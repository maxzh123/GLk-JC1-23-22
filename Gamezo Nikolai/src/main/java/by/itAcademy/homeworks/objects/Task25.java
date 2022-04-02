package by.itAcademy.homeworks.objects;

import java.util.Scanner;

/**
 * Задание 25
 * Создать класс, описывающий Банкомат.
 * Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами: количеством купюр номиналом 20, 50, 100.
 * Сделать методы для добавления денег в банкомат. Сделать метод, снимающий деньги. С клавиатуры передается сумма денег.
 * На экран – булевское значение (операция удалась или нет).
 * При снятии денег метод должен выводить на экран каким количеством купюр и какого номинала выдается сумма.
 * Создать конструктор с тремя параметрами – количеством купюр. Прочее – на ваше усмотрение.
 */

public class Task25 {
    public static void main(String[] args) {
        // начальное количество денег в банкомате
        ATM cash = new ATM(2,2,2);
        int num = 0;
        do {
            System.out.print("Снять 1, добавить 2 , выйти 3: ");
            Scanner choice = new Scanner(System.in);
            num = choice.nextInt();
            if (num == 1) {
                System.out.print("Введите сумму, которую хотите снять: ");
                Scanner in = new Scanner(System.in);
                int sum = in.nextInt();
                cash.withdrawMoney(sum);
                cash.getBanknot();
            }
            if (num == 2) {
                System.out.print("Сколько банкнот по 20 добавить: ");
                Scanner in20 = new Scanner(System.in);
                int num20 = in20.nextInt();
                if (num20 < 0 ) {
                    num20 = 0;
                    System.out.println("Введено отрицательное значение, приведено к нулю");
                }
                System.out.print("Сколько банкнот по 50 добавить: ");
                Scanner in50 = new Scanner(System.in);
                int num50 = in50.nextInt();
                if (num50 < 0 ) {
                    num50 = 0;
                    System.out.println("Введено отрицательное значение, приведено к нулю");
                }
                System.out.print("Сколько банкнот по 100 добавить: ");
                Scanner in100 = new Scanner(System.in);
                int num100 = in100.nextInt();
                if (num100 < 0 ) {
                    num100 = 0;
                    System.out.println("Введено отрицательное значение, приведено к нулю");
                }
                cash.addCash(num20, num50, num100);
                cash.getBanknot();
            }
            if (num != 1 && num != 2 && num != 3) {
                System.out.println("Введено неверное значение");
            }
        } while (num != 3);
        System.out.println("Выход");
    }
}





