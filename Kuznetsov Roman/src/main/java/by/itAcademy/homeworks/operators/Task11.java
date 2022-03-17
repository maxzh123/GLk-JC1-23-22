package by.itAcademy.homeworks.operators;

import java.util.Calendar;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        String[] actions = new String[7];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < actions.length; i++) {
            System.out.println("Enter action for " + (i+1)+" day");
            actions[i]=scanner.nextLine();
        }
        System.out.println("Enter day number");
        while(scanner.hasNextInt()){

            System.out.println("You've planned "+actions[scanner.nextInt()-1]);
        }
    }
}
