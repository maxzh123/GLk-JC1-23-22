package by.itAcademy.homeworks.objects;


import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        ATM atm = new ATM(10,10,10);
        System.out.println(atm.withDrawMoney(270));
        System.out.println(atm.toString());
    }
}
