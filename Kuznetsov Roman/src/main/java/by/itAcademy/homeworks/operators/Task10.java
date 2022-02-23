package by.itAcademy.homeworks.operators;

import java.util.Scanner;
public class Task10 {

    public static void main(String[] args) {
        final int housequantity=2;
        int[][]Houses= new int[housequantity][housequantity];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < housequantity; i++) {
            System.out.println("House:"+(i+1));
            for (int j = 0; j < housequantity; j++) {
                Houses[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter area configuration:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = 0; i < housequantity; i++) {
            System.out.println("House:"+(i+1));
            int perimetr = 1;
            for (int j = 0; j < housequantity; j++) {
                perimetr*=Houses[i][j];
            }
            if(perimetr>a*b)
                System.out.println("house is too big for that house");
            else
                System.out.println("House "+i+" fits in this area");

            //Можно было и реализовать с помощью классов, но переписывать код уже поздновато.
        }
    }
}
