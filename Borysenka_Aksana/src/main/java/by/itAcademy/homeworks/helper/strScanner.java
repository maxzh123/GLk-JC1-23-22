package by.itAcademy.homeworks.helper;

import java.util.Scanner;


public class strScanner {
    public  String  strEnter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        return sc.nextLine();
    }
}
