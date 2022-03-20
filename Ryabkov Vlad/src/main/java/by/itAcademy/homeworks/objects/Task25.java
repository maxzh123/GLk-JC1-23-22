package by.itAcademy.homeworks.objects;


import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {

        ATM atm1 = new ATM(10, 10, 10);
        System.out.print(atm1.withDrawMoney(170));
        System.out.println(atm1.toString());
    }
}
